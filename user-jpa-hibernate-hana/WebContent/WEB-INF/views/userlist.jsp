<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>
<table>
<c:forEach items="${users}" var="users">
    <tr>
        <td>user id: <c:out value="${users.id}"/></td>
        <td>User name: <c:out value="${users.name}"/></td>  
    </tr>
</c:forEach>
</table>
<a href="./user">Add user</a>
</body>
</html>