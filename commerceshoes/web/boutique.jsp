<%-- 
    Document   : boutique
    Created on : 14 juin 2018, 19:19:04
    Author     : Florian
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="inscription.css" />
        <title>JSP Page</title>
    </head>
    <body>      
        <%@include file="header.jsp" %>
        <h1>Page Inscription</h1>
        
                <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
        <form class="modal-content" action="c_inscription">
          <div class="container">
            <h1>Sign Up</h1>
            <p>Please fill in this form to create an account.</p>
            <hr>
            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" required>

            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required>

            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input type="password" placeholder="Repeat Password" name="psw-repeat" required>

            <label>
              <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
            </label>

            <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

            <div class="clearfix">
              <button type="submit" class="signupbtn">Sign Up</button>
            </div>
          </div>
        </form>


      <script>
      // Get the modal
      var modal = document.getElementById('id01');

      </script>
        
        
    </body>
</html>
