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
 
    <h2>Registration Form</h2>
  
    <form:form method="POST" modelAttribute="users">
        <form:input type="hidden" path="id" id="id"/>
        <table>
            <tr>
                <td><label for="first_name">First Name: </label> </td>
                <td><form:input path="first_name" id="first_name"/></td>
                <td><form:errors path="first_name" cssClass="error"/></td>
            </tr>
         
            <tr>
                <td><label for="last_name">Last Name: </label> </td>
                <td><form:input path="last_name" id="last_name"/></td>
                <td><form:errors path="last_name" cssClass="error"/></td>
            </tr>
     
            <tr>
                <td><label for="password">Password: </label> </td>
                <td><form:input path="password" id="password"/></td>
                <td><form:errors path="password" cssClass="error"/></td>
            </tr>  
             <tr>
                <td><label for="confirm_password">Confirm Password: </label> </td>
                <td><form:input path="confirm_password" id="confirm_password"/></td>
                <td><form:errors path="confirm_password" cssClass="error"/></td>
            </tr>
               
            <tr>
                <td colspan="3">
                    <c:choose>
                        <!-- <c:when test="${edit}">
                            <input type="submit" value="Update"/>
                        </c:when> -->
                        <c:otherwise>
                            <input type="submit" value="Register"/>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/' />">List of All Employees</a>
</body>
</html>