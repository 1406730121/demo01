<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
    <table border="1px solid #CCCCCC">
        <tr>
            <td>name</td>
            <td>age</td>
            <td>sex</td>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.sex}</td>
            </tr>
        </c:forEach>
    </table>
</html>