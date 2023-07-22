<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>파라미터 값 받기</h3>
	<form action="param1" method="post">
		name : <input type="text" name="name">
		age : <input type="number" name="age">
		<br>
		<input type="checkbox" name="inter" value ="java">자바
		<input type="checkbox" name="inter" value ="spring">스프링
		<input type="checkbox" name="inter" value ="db">데이터베이스
		<br>
		<button>제출</button><!-- 타입이 없으면 submit -->
	</form>
</body>
</html>