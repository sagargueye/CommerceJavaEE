/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Panier;
import model.Commande;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tenshi16
 */
public class Commander extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Commander</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Commander at " + request.getContextPath() + "</h1>");
            out.println("</body>");
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
        processRequest(request, response);
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
        HttpSession session=request.getSession();
        
        if(session.getAttribute("Commande")==null){
        ArrayList<Commande> Commande = new ArrayList<Commande>();
        Panier carroParaVistaACommande = (Panier) session.getAttribute("carroData");
         carroParaVistaACommande.setTotalPanier(Double.parseDouble(session.getAttribute("totalPanier").toString()));
         Timestamp timestamp = new Timestamp(System.currentTimeMillis());
         
          String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
         
         Commande CommandeN= new Commande(saltStr,carroParaVistaACommande,timestamp);
         
         Commande.add(CommandeN);
         System.out.println("se agrega, el numero es: "+Commande.size());
         session.setAttribute("Commande", Commande);
         session.setAttribute("carroData", null);
         session.setAttribute("Panier", null);
         response.sendRedirect("Historique.jsp");
        }
        else{
          ArrayList<Commande> Commande= (ArrayList<Commande>) session.getAttribute("Commande");
          
          Panier carroParaVistaACommande = (Panier) session.getAttribute("carroData");
         carroParaVistaACommande.setTotalPanier(Double.parseDouble(session.getAttribute("totalPanier").toString()));
         Timestamp timestamp = new Timestamp(System.currentTimeMillis());
         
           String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
         
         
         Commande CommandeN= new Commande(saltStr,carroParaVistaACommande,timestamp);
         Commande.add(CommandeN);
         System.out.println("se agrega, el numero es: "+Commande.size());
         session.setAttribute("Commande", Commande);
         session.setAttribute("carroData", null);
         session.setAttribute("Panier", null);
         response.sendRedirect("Historique.jsp");
        }
         
        //processRequest(request, response);
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
