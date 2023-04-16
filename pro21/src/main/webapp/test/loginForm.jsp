<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<% request.setCharacterEncoding("utf-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="frmLogin" method="post" action="${contextPath}/test/login.do">
		<table width="50%" align="center">
			<tr align="center">
				<td>아이디 <input type="text" name="userID" value="" size="20"></td>
			</tr>
			<tr align="center">
				<td>비밀번호 <input type="password" name="passwd" value="" size="20"></td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="로그인" size="20">
					<input type="reset" value="다시입력" size="20">
				</td>
			</tr>
		</table>
		
	</form>
</body>
</html>