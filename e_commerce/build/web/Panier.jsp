

<%@page import="beans.Panier"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.Produit"%>
<%@page import="beans.Commande"%>
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

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Commande</title>
    </head>
    <body>
         <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script type="text/javascript" src="js/muhScript.js"></script>
      <!--We do dis -->
        
     <nav>       
    <div class="nav-wrapper orange lighten-1">
      <a href="index.jsp" class="brand-logo">Commande</a>
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
         if(session.getAttribute("compra")==null){
         inicioHistorial=href404;
        }
        %>
        
        <li><a href="<%=inicioHistorial%>">Historiques des commandes</a></li>             
      </ul>
    </div>
      </nav>
    
    <!-- MODALS -->        
    <div id="loginModal" class="modal">
    <div class="modal-content">
        <form action="LogInServlet" method="post">
      <div class="input-field col s6">

          <input id="email" name="username" type="text" class="validate">
          <label for="email">Correo</label>
        </div>
        <div class="input-field col s6">
          <input id="password" name="password" type="text" class="validate">
          <label for="password">Contraseña</label>
          <button type="submit"  class="waves-effect waves-light btn orange darken-3">Iniciar</button>
=======
          <input id="email" name="usuario" type="text" class="validate">
          <label for="email">Email</label>
        </div>
        <div class="input-field col s6">
          <input id="password" name="contrasena" type="text" class="validate">
          <label for="password">Mot de passe</label>
          <button type="submit"  class="waves-effect waves-light btn orange darken-3">S'inscrire</button>
>>>>>>> 8a271b2dec462303af9f7c712b160653acdb0f7c
    </div>
        </form>
    </div>
    <div class="modal-footer">
        <p>Vous n'avez pas encore de compte?</p>
        <input type="button" class="waves-effect waves-light btn orange darken-4" value="Creer">
     <!-- <a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat">Agree</a> -->
    </div>
  </div>  
    
    
    <% 
    Panier carroParaVista = (Panier) session.getAttribute("carroData");
    
    %>
    <!-- Funcion que regresa el total en el carrito-->
    <%! 
        
        public double total(Panier e,ArrayList<Produit> d, HttpSession session){
            double total=0;
         for (int i=0;i<e.getProduitPanier().size();i++){
         
         total+=d.get(e.getProduitPanier().get(i)).getPrecioProduit()*e.getExistenciaProduitPanier().get(i) ;
         
        }
         session.setAttribute("totalPanier",total);
         return total;
    } 
        
        %>
    
    <!-- A LLENAR -->
    <% 
    
        System.out.println("cuantas veces se llama este jsp?");
        
        ArrayList<Produit> productos =(ArrayList<Produit>) session.getAttribute("productsLista"); 
        System.out.println("Vista"+ carroParaVista.getPanierID().toString());
        System.out.println("Vista"+ carroParaVista.getUtilisateurEmail());
        System.out.println("Vista"+ carroParaVista.getProduitPanier());
        System.out.println("Vista"+ carroParaVista.getExistenciaProduitPanier());
       
        
        for (int i=0;i<carroParaVista.getProduitPanier().size();i++){
            
        
    %>
     <div class="divider"></div>
                <div class="section">
                     <div class="row">
                         <div class="col s6 m3 l2"><img class="responsive-img" src="<%= productos.get(carroParaVista.getProduitPanier().get(i)).getImagenProduit() %>"></div>
                    <div class="col s6 m3 l2"><h5><%= productos.get(carroParaVista.getProduitPanier().get(i)).getNombre_producto() %></h5></div>
                    <div class="col s6 m3 l2"><p><%= productos.get(carroParaVista.getProduitPanier().get(i)).getPrecioProduit() %></p></div>
                    <div class="col s6  m3 l2 offset-l4">
                        <p>Quantité <%=carroParaVista.getExistenciaProduitPanier().get(i) %></p>
                        <form method="post" action="PanierLoad">
                            <input type="hidden" name="productoACambiar" value="<%= carroParaVista.getProduitPanier().get(i)%>">       
                            <input type="number" name="cantidadACambiar" required>
                    <button class="waves-effect waves-light btn orange darken-3" type="submit">Actualiser</button>
                        </form>
                    </div>
                     </div>
                </div>
     <%} %>

     <div id="total">
         <form action="Commander" method="post">
             <p>Total: </p>
             <input type="hidden" name="totalAPagar">
             <p><%= total(carroParaVista,productos,session)%>$</p>
             <button class="waves-effect waves-light btn orange darken-3" type="submit">Ajouter</button>
         </form>
         
         
     </div>
     
      <footer class="page-footer orange darken-4">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Application e_commerce</h5>
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
