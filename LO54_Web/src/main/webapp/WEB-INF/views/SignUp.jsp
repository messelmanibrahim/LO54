<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" language="java">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/footer.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Formation en ligne</title>
        <script>
            function register()
            {
                if (document.getElementById("lastname").value == "" 
                        || document.getElementById("firstname").value == "" 
                        || document.getElementById("address").value == ""
                        || document.getElementById("phone").value == ""
                        || document.getElementById("email").value == ""
                        || getQueryString('session') == "")
                {
                    alert("All elements are required");
                    return ;
                }
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
            <div class="container text-center">
                <img  width = 25% height = 20% src="${pageContext.request.contextPath}/images/Utbm.png"/>
            </div>
        </a>
        <div class="col-sm-4" ></div>
        <div class="col-sm-4" style="margin-top: 50px " id="login">
            <legend class=""><b>Register</b> for ${code} in ${city}</legend>
                <div class="control-group">
                  <label class="control-label" for="firstname">First Name</label>
                  <div class="controls">
                    <input type="text" id="firstname" name="firstname" placeholder="" class="form-control input-lg">
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="lastname">Last Name</label>
                  <div class="controls">
                    <input type="text" id="lastname" name="lastname" placeholder="" class="form-control input-lg">
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="address">Address</label>
                  <div class="controls">
                    <input type="text" id="address" name="address" placeholder="" class="form-control input-lg">
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="phone">Phone Number</label>
                  <div class="controls">
                    <input type="text" id="phone" name="phone" placeholder="" class="form-control input-lg">
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="email">Email Address</label>
                  <div class="controls">
                    <input type="email" id="email" name="email" placeholder="" class="form-control input-lg">
                  </div>
                </div>
                <div class="control-group">
                  <div class="controls">
                      </br>
                    <button class="btn btn-success" onclick="register()">Register</button>
                  </div>
                </div>
        </div>
        <div class="col-sm-4" ></div>
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
