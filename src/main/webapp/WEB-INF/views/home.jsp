<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.util.List"%>
<%@ page import="com.food.foodfinder.*"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1>
	Hello world!  
</h1>

<c:forEach var="foodFacilities" items="${foodFacilities}">
Item <c:out value="${foodFacilities.getApplicant()}"/><p>
</c:forEach>

</body>
</html>
