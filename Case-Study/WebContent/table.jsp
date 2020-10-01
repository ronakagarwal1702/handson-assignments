<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
</head>

<body>
	<h3> All the contacts are</h3>
		${mytable}
		
	<table>
		<thead>
			<tr>
			<th>Name</th>
			<th>Contact</th>
			</tr>
		</thead>
		<tbody>
			<core:forEach l="${mytable}" var="u">
			<tr> <td>${u.name}</td>
			<td>${u.contact}</td>
			</tr>
			</core:forEach>
		</tbody>
	</table>	
</body>
</html>