<%-- 
    Document   : jsp
    Created on : 28 mai 2018, 08:28:35
    Author     : p1623082
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css.css" />
        <title>Accueil</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Connexion à mon application">
        <link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />
        <!-- ci-dessous notre fichier CSS -->
        <link rel="stylesheet" type="text/css" href="/css/app.css" />
        <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
        <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato:400,700,300" />
        <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body class="body">
        
<%-- -------------------l'entête-------------------------------------------------%>
        <div class="header">
<<<<<<< HEAD
<<<<<<< HEAD
             <%@include file="header.jsp" %>
=======
            <div id="logo"> 
=======
    <div id="logo"> 
>>>>>>> 35e7c4e9cb63e91dee25f81c6b017b04ce7a4f09
                <h1> <img src="image/logo1.png" border="5" alt="logo"> 
                Shoes shop</h1>
            </div>
           <hr> <div id="bande_horizontale" >
                <line id="onglets">
                      <li><a href="c_inscription"> S'inscrire </a></li>
                      <li><a href="c_connexion"> Se connecter </a></li>
                      <li class="active"><a href="c_accueil"> Accueil </a></li>
                      </line>
            </div></hr>
           <%--  <h1>Hello World!</h1>
            <hr>
                  <h2>Hello World!</h2>  
            <hr>--%>
<<<<<<< HEAD
>>>>>>> e825020a100dc1682bbc7f9b6ca9cb554fa56be7
=======

>>>>>>> 35e7c4e9cb63e91dee25f81c6b017b04ce7a4f09
        </div>
        
<%-- -------------------contenue de la page d'accueil----------------------------%>
        <div class="contenue">
            <img src="image/image3.jpg" border="1"  alt="image1" > 
            <img src="image/img2.jpg" alt="..." >
            
            <%--
<span class="border border-secondary"></span>
<span class="border border-success"></span>
<span class="border border-danger"></span>
<span class="border border-warning"></span>
<span class="border border-info"></span>
<span class="border border-light"></span>
<span class="border border-dark"></span>
<span class="border border-white"></span>--%>
        </div>
        
<%--------------------- pied de page---------------------------------------------%>
       <div class="footerclasse">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
