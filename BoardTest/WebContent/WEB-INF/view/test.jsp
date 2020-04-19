<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
</head>
<body>
<table border="1" style="width: 700px">
	<tr>
		<th style="background-color: orange; width: 100;">작성자</th>
		<th style="background-color: orange; width: 150;">제목</th>
		<th style="background-color: orange; width: 200;">내용</th>
	</tr>
	
<c:forEach items="${tlist }" var="list">
<tr>
	<td>${list.writer }</td>
	<td>${list.title }</td>
	<td>${list.content }</td>
</tr>
</c:forEach>
</table>
</body>
</html>