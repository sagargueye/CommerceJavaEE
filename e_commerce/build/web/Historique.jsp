

<%@page import="model.Commande"%>
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
         <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
         <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>


        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Commande</title>
    </head>
    <body>
 
        <% 
        
        ArrayList<Commande> Commande = (ArrayList<Commande>) session.getAttribute("Commande");
        
        %>  

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
              if(session.getAttribute("usuario")!=null){
               inicioONombre="Bienvenido, ";
               inicioONombre+=session.getAttribute("usuario").toString(); 
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
         if(session.getAttribute("Commande")==null){
         inicioHistorial=href404;
        }
        %>
       
        <li><a href="<%=inicioHistorial%>">Historiques des Commandes</a></li>               
      </ul>
    </div>
      </nav>
    
    <!-- MODALS -->        
    <div id="loginModal" class="modal">
    <div class="modal-content">
        <form action="LogInServlet" method="post">
      <div class="input-field col s6">
          <input id="email" name="usuario" type="text" class="validate">
          <label for="email">Mail</label>
        </div>
        <div class="input-field col s6">
          <input id="password" name="contrasena" type="text" class="validate">
          <label for="password">Mot de passe</label>
          <button type="submit"  class="waves-effect waves-light btn orange darken-3">S'inscrire</button>
    </div>
        </form>
    </div>
    <div class="modal-footer">
        <p>Vous n'avez pas encore de compte?</p>
        <input type="button" class="waves-effect waves-light btn orange darken-4" value="Creer">
 
    </div>
  </div>     
  <br>
  
  <div class="container">
      <div class="row">
          <% for(int i=0;i<Commande.size();i++){ %>
          <div class="divider"></div>
                <div class="section">
                    
                    <div class="col s4 m4 l4"><p>Commande: <%= Commande.get(i).getCommandeID() %><!-- CommandeID--></p></div>
                    <div class="col s4 m4 l4"><p>Total: <%=Commande.get(i).getPanierCommandedo().getTotalPanier() %></p></div>
                    <div class="col s4  m4 l4"><p>Date: <%= Commande.get(i).getTimeStampCommande() %></p></div>
                </div>
                <div class="divider"></div>
          <%}%>
        </div>
  </div>
        
     <footer class="page-footer orange darken-4">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Application e_commerce</h5>
                <p class="grey-text text-lighten-4">20118</p>
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
