<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.LoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Login Successful</p><br>
<%
  if (session.getAttribute("loginBean") == null) {

    response.sendRedirect("index.jsp");

} else {

  LoginBean loginBean = (LoginBean) session.getAttribute("loginBean");
  out.println("<h2>" + "Welcome " + loginBean.getUsername() + "</h2>");
}
%>
	
	
	<form action="welcome.jsp" method="get">
	<p><%= request.getParameter("jtext") %></p>
	<input type="text" name="jtext">
	<input type="Submit" value="Send"></form>
	<br>
	
	
	<form action="<%=request.getContextPath()%>/Logout" method="post">
		<input type="submit" value="Logout"></input>
	</form>
	
	

</body>
</html>