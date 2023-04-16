<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보출력창</title>
<style>
   .cls1 {
   font-size:40px;
   text-align:center;
   }
   .cls2 {
   text-align:center;
   }
</style>
</head>
<body>
   <table border="1" align="center" width="80%" >
      <tr align="center" bgcolor="lightgreen">
         <td width="7%"><b>아이디</b></td>
         <td width="7%"><b>비밀번호</b></td>
         <td width="7%"><b>이름</b></td>
         <td width="7%"><b>이메일</b></td>
         <td width="7%"><b>가입일</b></td>
         <td width="7%"><b>수정</b></td>
         <td width="7%"><b>삭제</b></td>
      </tr>
      
      <c:forEach var="member" items="${membersList}">
         <tr align="center">
            <td width="7%">${member.id}</td>
            <td width="7%">${member.pwd}</td>
            <td width="7%">${member.name}</td>
            <td width="7%">${member.email}</td>
            <td width="7%">${member.joinDate}</td>
            <td width="5%"><a href="${contextPath}/member/updateMember.do?id=${member.id}">수정</a></td>
            <td width="5%"><a href="${contextPath}/member/removeMember.do?id=${member.id}">삭제</a></td>
         </tr>
      </c:forEach>
   </table>
   <a href="${contextPath}/member/memberForm.do"><p class="cls2">회원가입</p></a>
</body>
</html>