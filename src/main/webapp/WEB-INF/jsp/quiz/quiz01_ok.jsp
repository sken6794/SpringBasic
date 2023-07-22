<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
	1. QuizController에는 /quiz 폴더 아래의 모든 요청을 처리할 수 있는 컨트롤러를 생성하세요
	2. quiz01  화면처리를 할 수 있는 메서드를 생성 (quiz01 맵핑)
	3. 출력후엔 quiz01_ok 페이지에 "당신의 생일은 ~~~~년 ~~월 ~~일" 을 출력하세요
	--%>
	
	<h2>당신의 생일은</h2>
	${year }년 ${month } 월 ${day }일
	
</body>
</html>