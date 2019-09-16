<%-- 
    Document   : agecalculator
    Created on : Sep 16, 2019, 11:22:08 AM
    Author     : 785264
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculators</title>
    </head>
    <body>
                <h1>Age Calculator</h1>
        <div>
            <form action="age" method="post">
                Enter your age: <input type="number" name="age" value="${age}"><br>
                <input type="submit" value="Age next birthday"</input>
                <div>${calcAge}</div>
            </form>
                
                
            
        </div>
        
    </body>
</html>
