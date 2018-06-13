/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.*;
import javax.servlet.*;  
import javax.servlet.http.*;

/**
 *
 * @author Florian
 */
public class c_accueil extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
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
       
        /*
             RequestDispatcher rd; 
            rd = request.getRequestDispatcher("jsp.jsp");
            rd.forward(request, response) ;
         */
                
            
        String message = "Transmission de variables : OK !";
	request.setAttribute( "test", message );
	this.getServletContext().getRequestDispatcher("/jsp.jsp").forward( request, response );
      
    }



}
