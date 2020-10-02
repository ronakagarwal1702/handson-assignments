<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <!-- directive -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>A simple jsp dempo</h2>
	<h3>Adddition: ${10+20}</h3> 
 	<%@include file="simple.txt" %>
 	<%!
 		int i=10;
 	%>
	<%
		int j=10;
		Date date=new Date();
		i++;
		j++;
	%>
	<h3>Value of i: <%= i %></h3>
	<h3>Value of j: <%= j %></h3>
	<h3>Value of date: <%= date%></h3>
	<a href = "Servletdemo">ServletDemo</a>
	<form action = "Servletdemo" method = "GET">
		<label>
			Username <input type = "text" name = "un"><input type = "submit" value = "submit">
		</label>
	</form>
</body>
</html>