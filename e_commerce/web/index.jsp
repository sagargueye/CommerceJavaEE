 

<%@page import="java.util.ArrayList"%>
<%@page import="model.Produit"%>
<%@page import="model.Utilisateur"%>
<%@page import="java.lang.Object"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
         <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>


        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>e_commerce</title>
    </head>
    <body>
        

        
     <c:import url="/ProduitLoad" /> 
        <%  
            ArrayList<Produit> productos =(ArrayList<Produit>) session.getAttribute("productsLista"); 
     
        %>

      <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script type="text/javascript" src="js/muhScript.js"></script>

        
     <nav>       
    <div class="nav-wrapper orange lighten-1">
      <a href="index.jsp" class="brand-logo">e_commerce</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
          
         
          <%
              String inicioONombre="Se Connecter";
              String hrefDeLogin="#loginModal";
              if(session.getAttribute("Utilisateur")!=null){
               inicioONombre="Bienvenido, ";
               inicioONombre+=session.getAttribute("Utilisateur").toString(); 
               hrefDeLogin="#";
              }
             
          
    %>
            
    <li><a href="<%=hrefDeLogin%>"><%=inicioONombre%></a></li>     
        <% String inicioNombreCarro="Panier.jsp";
            String href404="Notfound.jsp";
         if(session.getAttribute("carroData")==null){
         inicioNombreCarro=href404;
        }
        %>
    
        <li><a href="<%=inicioNombreCarro%>">Panier</a></li>            
        <% String inicioHistorial="Historique.jsp";
         if(session.getAttribute("compra")==null){
         inicioHistorial=href404;
        }
        %>
       
        <li><a href="<%=inicioHistorial%>">Historique des commandes</a></li>        
      </ul>
    </div>
      </nav>
    
        
    <div id="loginModal" class="modal">
    <div class="modal-content">
        <form action="LogInServlet" method="post">
      <div class="input-field col s6">
          <input id="email" name="Utilisateur" type="text" class="validate">
          <label for="email">Email</label>
        </div>
        <div class="input-field col s6">
          <input id="password" name="Motdepasse" type="text" class="validate">
          <label for="password">Mot de passe</label>
          <button type="submit"  class="waves-effect waves-light btn orange darken-3">Se Connecter</button>
    </div>
        </form>
    </div>
    <div class="modal-footer">
        <p>Vous n'avez pas encore de compte?</p>
        <input type="button" class="waves-effect waves-light btn orange darken-4" value="Creer">

    </div>
  </div>   
  

 
  
  <div class="container">
      <div class="row">
       
   <% 
    
    
   for(int i=0;i<productos.size();i++){
       
       
   %>
  
   
    <div class="col s12 m4 l3">
            <div class="card medium sticky-action" style="overflow: hidden;">
              <div class="card-image waves-effect waves-block waves-light">
                  <img class="activator responsive-img" src="<%= productos.get(i).getImagenProduit() %>">
              </div>
              <div class="card-content">
                  <p><%= productos.get(i).getNombre_producto()%></p>

                  <p class="precio"><%=productos.get(i).getPrecioProduit()%>€</p>
              </div>

              <div class="card-action">
  
            
                <form id="productBuyOcult" action="ProduitLoad" method="post">
                 <input type="hidden" name="idCurrent" value="<%=i%>" id="idCurrent"/>
                  
        
                 <button class="waves-effect waves-light btn orange darken-3" type="submit" name="botonCommande">Acheter</button>
              </form>
              </div>

              <div class="card-reveal" style="display: none; transform: translateY(0px);">
                <span class="card-title grey-text text-darken-4">Description<i class="material-icons right">Fermer</i></span>
                <p><%=productos.get(i).getDescripcionProduit()%></p>
              </div>
            </div>
          </div>
    
          <% }%>
      </div> 
      </div> 
      
     <footer class="page-footer orange darken-4">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Application e-commerce</h5>
                <p class="grey-text text-lighten-4">2018</p>
              </div>    
              <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Navigation</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="index.jsp">Accueil</a></li>
                  <li><a class="grey-text text-lighten-3" href="<%=inicioNombreCarro%>">Panier</a></li>
                  <li><a class="grey-text text-lighten-3" href="<%=inicioHistorial%>">Historiques des commandes</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            © 2018 Perreaut Florian et Sagar Gueye
            <a class="grey-text text-lighten-4 right" href="#!"></a>
            </div>
          </div>
        </footer>
            
      
  </body>
</html>
