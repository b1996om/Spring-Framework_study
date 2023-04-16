<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<% 
  request.setCharacterEncoding("utf-8"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>뉴스목록창</title>
<style>
	table {
		border-collapse: collapse;
		}
</style>
</head>
<body>
	<h1>뉴스 목록</h1>
	<hr>
	<table align="center" width="80%" >
	
		<c:forEach var="news" items="${newsList}">
			<tr>${news.aid}</tr>
			<tr>${news.title}</tr>
			<tr>${news.date}</tr>
		</c:forEach>
		
	</table>
	
	<hr>
	<input type="submit" value="뉴스등록"><a href="#"></a>  <!--newsview 페이지 추가  -->
	
</body>
</html>