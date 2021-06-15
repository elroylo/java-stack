<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" media="screen" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
	<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Create a new Ninja</h1>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninjaObj">
			<p>
				<form:select path="dojo">
					<c:forEach items="${allDojos }" var="dojo">
						<form:option value="${dojo.id }">
							<c:out value="${ dojo.name}" />
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			<p>
				First Name:
				<form:input type="text" path="first_name" />
				<form:errors path="first_name" />
			</p>
			<p>
				Last Name:
				<form:input type="text" path="last_name" />
				<form:errors path="last_name" />
			</p>
			<p>
				Age:
				<form:input type="number" path="age" />
				<form:errors path="age" />
			</p>
			<button type="submit">Create</button>
		</form:form>
	</div>
</body>
</html>