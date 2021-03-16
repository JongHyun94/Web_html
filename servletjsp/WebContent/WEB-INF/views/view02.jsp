<%-- page 지시자 --%>
<!-- 태그주석 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>view02.jsp</h5>
<%-- 스크립트릿 scriptlet--%>
<% String name = "홍길동"; %>
<%-- 표현식 expressions--%>
이름: <%=name %>
<% for(int i=1;i<6;i++){%>
<h<%=i%>><%=name%></h<%=i%>>
<%} %>
<hr/>
</body>
</html>