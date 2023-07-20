<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
Enter First Name:<input type="text" name="fname"><br>
Enter age:<input type="text" name="age"><br>
Enter email:<input type="text" name="email"><br>
Enter password:<input type="password" name="password"><br>
Gender:<input type="radio" name="gender" value="female">Female
&nbsp;&nbsp;
     <input type="radio" name="gender" value="male">Male<br>
Hobbies:<input type="checkbox" name="hobbies" value="Reading">Reading<br>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="checkbox" name="hobbies" value="gaming">Gaming<br>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="checkbox" name="hobbies" value="cooking">Cooking<br>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="checkbox" name="hobbies" value="browsing">Browsing<br>
Country:<select name="country">
      <option value="select">Select a country</option>
      <option value="INDIA">INDIA</option>
      <option value="USA">USA</option>
      <option value="UK">UK</option>
      <option value="Other">Other</option>
</select><br><br>
<input type="submit" value="register" name="register">
<%if(request.getParameter("register")!=null){%>
       <jsp:useBean id="user" class="com.to.User" scope="request"></jsp:useBean>
       <jsp:setProperty property="*" name="user"/>
       <jsp:forward page="RegisterServelet"></jsp:forward>
<%} %>

</body>
</html>