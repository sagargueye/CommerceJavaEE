<%-- 
    Document   : connexion
    Created on : 1 juin 2018, 10:23:12
    Author     : P1623082
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cssConnexion.css" />
        <title>connexion</title>
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
    <body>
        <section>
            <%@include file="header.jsp" %>
        </section>
   <%-- contenue de la page connexion --%>
        <section>
                <div class="container">
    <div class="row">
    <div class="col-xs-12">
        
        <div class="main">
                
            <div class="row">
            <div class="col-xs-12 col-sm-6 col-sm-offset-1">
                        
                <h1> Shoes shop </h1>
                <h2>Connexion</h2>
                       <% //veriable alerte %> 
                <form action="c_connexion" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">
                    <div class="form-group">
                    <div class="col-md-8"><input name="username" placeholder="Idenfiant" class="form-control" type="text" id="UserUsername"/></div>
                    </div> 
                    
                    <div class="form-group">
                    <div class="col-md-8"><input name="password" placeholder="Mot de passe" class="form-control" type="password" id="UserPassword"/></div>
                    </div> 
                    
                    <div class="form-group">
                    <div class="col-md-offset-0 col-md-8"><input  class="btn btn-success btn btn-success" type="submit" value="Connexion"/></div>
                    </div>
                
                </form>

                <p class="credits">Développé par des <a href="https://etu.univ-lyon1.fr" target="_blank">ETUDIANT de L'IUT Lyon 1</a>.</p>


            </div>
            </div>
            
        </div>
    </div>
    </div>
    </div>
        </section>      
  <%-- pied de page --%>
        <section>
            <%@include file="footer.jsp" %>
        </section>
    </body>
</html>
