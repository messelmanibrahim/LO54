<%-- 
    Document   : SignUp
    Created on : Dec 28, 2017, 12:44:15 AM
    Author     : yassine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" language="java">
        <title>Formation en ligne</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/CourseSession">
        <header style="width:100%; height: 150px; background-color: blue;">
        </header>
        </a>
        
        <div class='login'>
            <h2>Register</h2>
            <form action="SuccessInscription" method="post" id="login"><br/>
            <input name='lastname' placeholder='Lastname' type='text' required=""><br/>
            <input name='firstname' placeholder='Firstname' type='text' required=""><br/>
            <input name='address' placeholder='Address' type='text' required=""><br/>
            <input name='phone' placeholder='Phone' type='text' required=""><br/>
            <input name='email' placeholder='Email' type='text' required=""><br/>
            <input type="hidden" name="session" value="${session}"><br/>
            </form>
            <input type='submit' form="login" value='Register'>
        </br>
        </br>
        </br>
        </div>
    </body>
</html>
