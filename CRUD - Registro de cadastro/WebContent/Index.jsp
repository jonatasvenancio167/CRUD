<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="DAO.ConexaoDB"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastre-se</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
	<h3>Registro de Contato</h3>
	Nome: <input type="text" name="nome" placeholder="nome"></br>
	Telefone: <input type="number" name="telefone" placeholder="telefone"></br>
	idade: <input type="number"  name="idade" placeholder="idade"></br>
	<%
		ConexaoDB.getConexaoMySQL();
		out.println(ConexaoDB.getConexaoMySQL());
	%>
</body>
</html>