

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
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
         <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>


        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>e_commerce</title>
    </head>
    <body>
        <script>
            function mensaje(){
             if (document.getElementById("cantidadProduit").value.valueOf(!null)){
                 console.log("etehbe");
                // Materialize.toast('Produit Agregado', 4000);
                 return true;   
             }
             else {return false;} 
         }
            
        </script>

        <%  //Llama los productos
           ArrayList<Produit> productos =(ArrayList<Produit>) session.getAttribute("productsLista"); 
            
        %>
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script type="text/javascript" src="js/muhScript.js"></script>
      <!--We do dis -->
        
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
            
    <li><a href="<%=hrefDeLogin%>"><%=inicioONombre%></a></li>      <!-- //cambia-->
     <% String inicioNombreCarro="Panier.jsp";
            String href404="Notfound.jsp";
         if(session.getAttribute("carroData")==null){
         inicioNombreCarro=href404;
        }
        %>
        <li><a href="<%=inicioNombreCarro%>">Panier</a></li>            <!--  //cambia-->
        
         <% String inicioHistorial="Historique.jsp";
         if(session.getAttribute("Commande")==null){
         inicioHistorial=href404;
        }
        %>
        
        <li><a href="<%=inicioHistorial%>">Historiques des commandes</a></li>           <!-- //cambia-->
      </ul>
    </div>
      </nav>
        
        
        <% 
        
        int current=Integer.parseInt(session.getAttribute("current").toString());
        
        
        System.out.print("er current" +current);
        %>
        <div id="agregarACarro" class="container">
   
       <div class="row">     
           
               <h4 class="col l6 m8 offset-l4 offset-m4"><%= productos.get(current).getNombre_producto()%></h4>
     <h5 class="col l6 m8 offset-l6 offset-m5">$<%=productos.get(current).getPrecioProduit()%></h5>
     <img class="responsive-img col l6 m8 offset-l3 offset-m2" width="60%" src="<%= productos.get(current).getImagenProduit() %>">
    
     <p class="col l10 offset-l1"><%=productos.get(current).getDescripcionProduit()%></p> 
     
       <div class="col l1 offset-l4"><p>Quantité: </p></div>
       <form action="AddToCart" method="post">
       <div class="col l2"><input name="cantidad" id="cantidadProduit" type="number" required min="1" max="<%= productos.get(current).getExistenciaProduit()%>"></div>
      <div class="col l2"><button type="submit"  class="waves-effect waves-light btn orange darken-4" onclick="return mensaje()" >Ajouter</button></div>
       </form>
        </div>
         
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
