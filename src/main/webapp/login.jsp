<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Login Page</h1>
 ${SPRING_SECURITY_LAT_EXCEPTION.message} 

<form action="login" method='POST'>

username <input type="text" name ="username"/>
password <input type="password" name="pass"/> 

         <input type="submit" value="submit"> 
         </form>
</body>
</html>