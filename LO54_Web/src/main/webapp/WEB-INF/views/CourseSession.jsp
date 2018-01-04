<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" language="java">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/search.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/data.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/footer.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Bitter" rel="stylesheet" type="text/css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Formations</title>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    </head>
    <body>
        <header>
            <a href="${pageContext.request.contextPath}/CourseSession">
                <div class="container text-center">
                    <img  width = 25% height = 20% src="${pageContext.request.contextPath}/images/Utbm.png"/>
                </div>
            </a>
            <form action="CourseSession" method="get">
                <div class="container">
                    <div class="row">
                      <div class="col-md-12">
                        <div class="input-group" id="adv-search">
                            <input type="text" class="form-control" name="search_title" placeholder="Couse Code" />
                            <div class="input-group-btn">
                                <div class="btn-group" role="group">
                                    <div class="dropdown dropdown-lg">
                                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                                        <div class="dropdown-menu dropdown-menu-right" role="menu">
                                            <div class="form-group">
                                              <label for="filter">Filter by location and date</label>
                                              <select class="form-control" name="search_location">
                                                  <option selected="selected" name="at_date" value="">All</option>
                                                    <c:forEach items="${Locations}" var="location">
                                                        <option name="${location.city}" value="${location.city}" >${location.city}</option>				
                                                    </c:forEach>
                                              </select>
                                            </div>
                                            <div class="form-group">
                                              <input class="form-control" type="date" name="search_date" />
                                            </div>
                                        </div>
                                    </div>
                                    <button type="submit" value="Search" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </div>
                            </div>
                        </div>
                      </div>
                    </div>
                </div>
            </form>
        </header>
                    
        <div id="data-table" class="clear">
            <c:forEach items="${Courses}" var="cs">
                <div class="courseSession">
                    <h3><span>${cs.course.code}</span></h3>
                    <a class="signup" href="SignUp?session=${cs.id}&code=${cs.course.code}&city=${cs.location.city}">Sign up</a>         
                    <ul>
                        <li><marquee behavior="scroll" direction="left">${cs.course.title}</marquee></li>
                        <li><b>Start date:</b> <fmt:formatDate value = "${cs.start}" pattern = "dd MMM, yyyy" /></li>
                        <li><b>End date:</b> <fmt:formatDate value = "${cs.end}" pattern = "dd MMM, yyyy" /></li>
                    <li><b>Location :</b> ${cs.location.city}</li>            
                    </ul> 
                </div>
            </c:forEach>
        </div>
                    
        <footer>
            <div class="container">
              <div class="row">
                       <div class="col-md-4 col-sm-6 col-xs-12">
                         <span class="flogo"><img  width = 45% height = 40% src="${pageContext.request.contextPath}/images/Utbm.png"/></span>
                       </div>

                       <div class="col-md-4 col-sm-6 col-xs-12">
                           <ul class="menu">
                                <span>Menu</span>    
                                <li>
                                   <a href="${pageContext.request.contextPath}/CourseSession">Home</a>
                                 </li>
                            </ul>
                       </div>
                       <div class="col-md-4 col-sm-6 col-xs-12">
                         <ul class="fadress">
                               <span>Contact</span>       
                               <li>
                                  <i class="fa fa-phone" aria-hidden="true"></i> <a href="">Phone</a>
                               </li>
                               <li>
                                  <i class="fa fa-map-marker" aria-hidden="true"></i> <a href="">Adress</a>
                               </li> 
                               <li>
                                  <i class="fa fa-envelope" aria-hidden="true"></i> <a href="">Email</a>
                               </li> 
                          </ul>
                      </div>
                  </div> 
               </div>
        </footer>
    </body>
</html>
