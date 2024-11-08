<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>시간표</title>
</head>
<body>
오후일정 : 5시 30분까지 숨도 쉬지말고 화장실도 가지말고
	잠도 자면 안되고 공부하기...
	<a href="<%=request.getContextPath() %>/viewMessage?time=4&name=human">[시간표보기]</a>
	<form action="viewMessage" method="post">
		<input type="text" name="time">
		<input type="text" name="name">
		<input type="submit" name="전송">
	</form>
</body>
</html>