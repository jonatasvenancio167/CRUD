package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	
	  public static String status = "Não conectou...";	
	  String serverName = "jdbc:mysql://localhost:3306";
	  private static String driverName = "com.mysql.jdbc.Driver";
	  private static String url = "jdbc:mysql://127.0.0.1:3306/?autoReconnect=true&useSSL=false";
	  private static String name = "root";
	  private static String password = "";
	  private static Connection connection = null;
	  
	   
	  public ConexaoDB() {
		super();
	  }
	
	
	  public static Connection getConexaoMySQL()throws Exception{
	              
	      //Load the default driver JDBC
	  try{
	      
	      Class.forName(driverName);
	      connection = DriverManager.getConnection(url, name, password);
	       
	      //Test connection
	      if(connection != null || connection.isClosed()) {
	    	  connection = DriverManager.getConnection(url, name, password);
	    	  status = ("Status = Conexão realizada com sucesso");
	      }
	      else {
	    	  status = ("Status = Não foi possível conectar");
	      }
	      return connection;
	      
	  }
	  catch(ClassNotFoundException e){
	      System.out.println("Não foi possível encontrar o Drive");
	      return null;
	  }
	  catch(SQLException e){
		  System.out.println("Não foi possível conectar com o Banco de Dados");
	    	  return null;
	      }
	      
	   }
	
	   //Returns the status of the connection
	   public static Connection ResultConnection() {
		   return connection;
	   }
	
		//Close the connection to the database
	public static boolean StopConnection() throws Exception {
		try {
			ConexaoDB.getConexaoMySQL().close();
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}
	
	//Restart the database connection
	public static java.sql.Connection RestartConnection() throws Exception{
		StopConnection();
		return ConexaoDB.getConexaoMySQL();
	}
}
