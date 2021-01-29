<%-- 
    Document   : agecalculator
    Created on : 28-Jan-2021, 8:28:39 AM
    Author     : klydm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <p>${message}</p>
            <input type="submit" value="Age next birthday">  
        </form>
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
