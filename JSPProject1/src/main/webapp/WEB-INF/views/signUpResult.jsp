<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>

<%
	String inputId = request.getParameter("inputId");
	String[] inputPw = request.getParameterValues("inputPw");
	String inputName = request.getParameter("inputName");
	String inputEmail = request.getParameter("inputEmail");
	String[] hobby = request.getParameterValues("hobby");
	
	String result = null;
	if(inputPw[0].equals(inputPw[1])) {
		result = inputName + "의 회원가입이 완료되었습니다.";
	}else {
		result = "비밀번호가 일치하지 않습니다.";
	}
	
	String userHobby = "";
	for(String s : hobby){
		userHobby += s + " ";
	}
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>회원 가입 (JSP 버전)</title>
  </head>
  <body>
  
  	<% if(inputPw[0].equals(inputPw[1])){ %>
	  	<ul>
	      <li>아이디 : <%= inputId %></li>
	      <li>비밀번호 : <%= inputPw[0] %></li>
	      <li>이름 : <%= inputName %></li>
	      <li>이메일 : <%= inputEmail %></li>
	      <li>취미 : <%= userHobby %></li>
	    </ul>
  	<%}  %>
  
    <h3><%= result %></h3>
  </body>
</html>