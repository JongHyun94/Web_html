<%-- page 지시자 --%>
<!-- 태그주석 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.mycompany.webapp.dto.*"%>
<%-- taglib 지시자 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/servletjsp/common/bootstrap-4.6.0-dist/css/bootstrap.min.css">
<script src="/servletjsp/common/jquery/jquery-3.5.1.min.js"></script>
<script
	src="/servletjsp/common/bootstrap-4.6.0-dist/js/bootstrap.bundle.min.js"></script>
<script
	src="/servletjsp/common/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<h5>view05.jsp</h5>
	<hr />
	
	
	<c:forEach var="board" items="${list}">
			<div class="alert alert-primary">
				<div>${board.bno}</div>
				<div>${board.btitle}</div>
				<div>${board.bcontent}</div>
				<div>${board.bwriter}</div>
			</div>
	</c:forEach>
	
</body>
</html>