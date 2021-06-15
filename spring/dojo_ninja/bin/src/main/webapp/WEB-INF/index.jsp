<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" media="screen" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
	<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Create a new Dojo</h1>
		<form:form action="/dojos/new" method="post" modelAttribute="dojoObj">
			<p>
				Name:
				<form:input type="text" path="name" />
				<form:errors path="name" />
			</p>
			<button type="submit">Create</button>
		</form:form>
	</div>
</body>
</html>