<%-- 
    Document   : arithmeticcalculator
    Created on : 28-Jan-2021, 3:09:08 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            
            <input type="submit" value="+" name="+">
            <input type="submit" value="-" name="-">
            <input type="submit" value="*" name="*">
            <input type="submit" value="%" name="%">
            <p>${message}</p>
        </form>
            <a href="age">Age Calculator</a>
    </body>
</html>
