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
				<td>���̵� <input type="text" name="userID" value="" size="20"></td>
			</tr>
			<tr align="center">
				<td>��й�ȣ <input type="password" name="passwd" value="" size="20"></td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="�α���" size="20">
					<input type="reset" value="�ٽ��Է�" size="20">
				</td>
			</tr>
		</table>
		
	</form>
</body>
</html>