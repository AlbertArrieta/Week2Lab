<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 16, 2019, 8:15:11 PM
    Author     : 785264
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post"> 
        First:<input type="text" name="num1" value="${num1}"> <br>
        Second:<input type="text" name="num2" value="${num2}"><br>
        <input type="submit" value="+" name="calc">
        <input type="submit" value="-" name="calc">
        <input type="submit" value="*" name="calc">
        <input type="submit" value="%" name="calc">
        <br>
        <br>
        <div> Result: ${result} </div>
        
    </body>
</html>
