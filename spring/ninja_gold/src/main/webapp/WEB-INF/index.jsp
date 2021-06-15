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
		<h1>Your Gold <%= session.getAttribute("pouch") %> </h1>
		<a href="/destroy_session">Start Again</a>
		<div>
			<h1>Farm</h1>
			<form action="/process_money" method="POST">
				<input type="hidden" name="place" value="farm" />
				<button type="submit">Submit</button>
			</form>
			<h1>Cave</h1>
			<form action="/process_money" method="POST">
				<input type="hidden" name="place" value="cave" />
				<button type="submit">Submit</button>
			</form>
			<h1>House</h1>
			<form action="/process_money" method="POST">
				<input type="hidden" name="place" value="house" />
				<button type="submit">Submit</button>
			</form>
			<h1>Casino</h1>
			<form action="/process_money" method="POST">
				<input type="hidden" name="place" value="casino" />
				<button type="submit">Submit</button>
			</form>
		</div>
		<div>
			<c:forEach items="${log }" var="act">
				<p>
					<c:out value="${act }" />
				</p>
			</c:forEach>
		</div>
	</div>
</body>
</html>