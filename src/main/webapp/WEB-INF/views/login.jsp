<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Registration Form</title>
 
<style>
 
    .error {
        color: #ff0000;
    }
</style>
 
</head>
 
<body>
 
    <h2>Login Form</h2>
  
    <form method="POST">
        <table>
            <tr>
                <td><label for="email">First Name: </label> </td>
                <td><input type="text" name="email" id="email"/></td>
            </tr>
     
            <tr>
                <td><label for="password">Password: </label> </td>
                <td><input type="password" name="password" id="password"/></td>
            </tr>                
            <tr>
                <td colspan="3">
                   
                            <input type="submit" value="Login"/>
                </td>
            </tr>
        </table>
    </form>
    <br/>
    <br/>
   <a href="<c:url value='/registration' />">Sign Up</a>
</body>
</html>