<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>점수 목록</h3>

	<c:forEach items="${list }" var="vo" varStatus="num">
		${num.index } <br> 
		 이름 : ${vo.name } <br>
		 국어 : ${vo.kor } <br>
		 영어 : ${vo.eng } <br>
		 
		 <button onclick="location.href='scoreDelete?num=${num.index}'">삭제</button>
		 <hr> 
	</c:forEach>
	<a href="scoreRegist">점수 등록하기</a>


</body>
</html>