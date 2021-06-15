<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World Welcome to my very first JSP!</h1>
	<form action="/submit" method="POST">
		Name: <input type="text" name="name" />
		<input type="submit" value="Submit your name!" />
	</form>
</body>
</html>