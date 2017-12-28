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
        <script>
            function register()
            {
                // Update a user
                var url = "http://localhost:8080/LO54_Web/request/signup";

                var data = {};
                data.lastname = document.getElementById("lastname").value;
                data.firstname = document.getElementById("firstname").value;
                data.address = document.getElementById("address").value;
                data.phone = document.getElementById("phone").value;
                data.email = document.getElementById("email").value;
                data.sessionid = getQueryString('session');
                var json = JSON.stringify(data);
                var xhr = new XMLHttpRequest();
                xhr.open("POST", url, true);
                xhr.setRequestHeader('Content-type','application/json; charset=utf-8');
                xhr.send(json);
                /*
                xhr.onload = function () {
                    var users = JSON.parse(xhr.responseText);
                    if (xhr.readyState == 4 && xhr.status == "200") {
                            console.table(users);
                    } else {
                            console.error(users);
                    }
                }
                */
            };
            var getQueryString = function ( field, url ) {
                var href = url ? url : window.location.href;
                var reg = new RegExp( '[?&]' + field + '=([^&#]*)', 'i' );
                var string = reg.exec(href);
                return string ? string[1] : null;
            };
        </script>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/CourseSession">
        <header style="width:100%; height: 150px; background-color: blue;">
        </header>
        </a>
        
        <div class='login'>
            <h2>Register</h2>
            <form  onsubmit="register()" id="login"><br/>
            <input name='lastname' id="lastname" placeholder='Lastname' type='text' required="">
            <input name='firstname' id="firstname" placeholder='Firstname' type='text' required="">
            <input name='address'  id="address" placeholder='Address' type='text' required="">
            <input name='phone' id="phone" placeholder='Phone' type='text' required="">
            <input name='email'  id="email" placeholder='Email' type='text' required="">
            <input type='submit' value='Register'>
            </form>
        </br>
        </br>
        </br>
        </div>
    </body>
</html>
