<%-- page 지시자 --%>
<!-- 태그주석 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h5>view03.jsp</h5>
	<hr />
	<table class="table">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>글쓴이</th>
		</tr>
		<tr>
		<%-- EL로 데이터 출력 --%>
		<%-- getBno() 을 bno로 만들어줌 필드가 아님 --%>
			<td>${board.bno}</td>
			<td>${board.btitle}</td>
			<td>${board.bcontent}</td>
			<td>${board.bwriter}</td>
		</tr>
	</table>
</body>
</html>