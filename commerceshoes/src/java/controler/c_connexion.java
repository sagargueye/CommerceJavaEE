/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import modele.classeMain;

/**
 *
 * @author Florian
 */
public class c_connexion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    boolean infoconnexion;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");

            out.println("test");
            ServletConfig config=getServletConfig();
            String username= request.getParameter("username");     
            String password= request.getParameter("password");
            infoconnexion = classeMain.verifyconnextion(username ,password);
            String message_connexion;
            if (infoconnexion==false){
                message_connexion="mot de passe ou identifiant incorrecte";           
            }
            out.println("<table><tr><td>"+username+"</td></tr>  <tr><td>"+password+"</td></tr>");
            
            System.out.println(username);
            System.out.println(password);
            
            
            
            
            /*
         
            String nom=request.getParameter("nom");
            Cookie   MonCookie =  new  Cookie ("nom", nom); 
            response.addCookie(MonCookie);

        
            
             String nom=request.getParameter("nom");

             //Création du cookie
             Cookie C = new Cookie("id","723884532");
             //Définition de la limite de validité du cookie
             C.setMaxAge(24*3600);
             //Envoi du cookie dans la réponse HTTP 
             response.addCookie(C);

             session.setAttribute("nom" , nom);
            */


             
        
            
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          ServletConfig config=getServletConfig();
            String username= request.getParameter("username");     
            String password= request.getParameter("password");
            infoconnexion = classeMain.verifyconnextion(username ,password);
            String message_connexion;
            if (infoconnexion==false){
            message_connexion="mot de passe ou identifiant incorrecte";  
            //response.sendRedirect("Notfound.jsp");
            System.out.println(" ca ne marche pas");
            request.setAttribute( "test", message_connexion );
            this.getServletContext().getRequestDispatcher("/header.jsp").forward( request, response );
        }else {
            HttpSession session=request.getSession();  
            session.setAttribute("username",username); // agregar el email como sesion 
            // RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
           // rd.forward(request, response);
             //response.sendRedirect("index.jsp");
            // System.out.println(" ca marche");
             message_connexion="mot de passe ou identifiant correcte";  
             request.setAttribute( "test", message_connexion );
	this.getServletContext().getRequestDispatcher("/inscription.jsp").forward( request, response );
             
       }
        String message = "Transmission de variables : OK !";
	request.setAttribute( "test", message );
	this.getServletContext().getRequestDispatcher("/connexion.jsp").forward( request, response );        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String message = "Transmission de variables : OK !";
	request.setAttribute( "test", message );
	this.getServletContext().getRequestDispatcher("/connexion.jsp").forward( request, response );       
        
    }

    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
