<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Errore</title>
</head>
<body >
<% String msg=(String)session.getAttribute("msg"); %>  

  <h1 style="color: red; text-align: center;">  <%=msg %> </h1>
<div style="text-align: center;  "><img  style="margin-left: auto; margin-right: auto width="500px" height="500px"   src="image/OIP.jpeg" alt="">  </div>
</body>
</html>