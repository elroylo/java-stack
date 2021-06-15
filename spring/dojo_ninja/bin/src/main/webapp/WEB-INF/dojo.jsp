<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" media="screen" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
	<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${dojo.name }" /> Location Ninjas</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojo.ninjas }" var="ninja">
					<tr>
						<td><c:out value="${ninja.first_name }" /></td>
						<td><c:out value="${ninja.last_name }" /></td>
						<td><c:out value="${ninja.age }" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<h1>Ninjas not in Dojo</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ninjas }" var="ninja">
					<tr>
						<td><c:out value="${ninja.first_name }" /></td>
						<td><c:out value="${ninja.last_name }" /></td>
						<td><c:out value="${ninja.age }" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>