<%-- 
    Document   : CourseSessions
    Created on : Dec 7, 2017, 10:43:39 PM
    Author     : yassine
--%>

<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formations</title>
    </head>
    <body>
        <header style="width:100%; height: 150px; background-color: blue;">
            
        </header>
        
        <div id="search" style="width:100%; height: 100px; background-color: #00cccc;">
            <form action="CourseSession" method="get">                    
                <br />
                <input type="text" name="search_title" placeholder="Couse Name"  autocomplete="off"/>
                <br />
                <select name="search_location" >
                        <option selected="selected" name="at_date" value="">Choose a location</option>
                        <c:forEach items="${Locations}" var="location">
                            <option name="${location.city}" value="${location.city}" >${location.city}</option>				
                        </c:forEach>
                </select>
                <input type="date" name="search_date" placeholder="Date"  autocomplete="off"/>
                <input type="submit" value="Search"/>
            </form>
        </div>
        <div id="data">
            <c:forEach items="${Courses}" var="cs">
                <a href="SignUp?session=${cs.id}" style="text-decoration:none; color: black">
                <div id="CourseSession">
                    <h1>${cs.course.code}</h1>
                    <h3>${cs.course.title}</h3>
                    <h3>Start date: 
                        <fmt:formatDate value = "${cs.start}" pattern = "yyyy-mm-dd" />
                    </h3>
                    <h3>End   date:
                        <fmt:formatDate value = "${cs.end}" pattern = "yyyy-mm-dd" />
                    </h3>
                    <h3>Location  : ${cs.location.city}</h3>
                </div>
                </a> 
            </c:forEach>
        </div>
        <footer style="width:100%; height: 150px; background-color: #003399;">
            
        </footer>
    </body>
</html>
