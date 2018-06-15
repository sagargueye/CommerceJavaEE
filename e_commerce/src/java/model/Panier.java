/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author clases
 */
public class Panier {

    public Panier(String carritoID, String usuarioEmail, double totalPanier) {
        this.carritoID = carritoID;
        this.usuarioEmail = usuarioEmail;
        this.totalPanier = totalPanier;
    }

   

    public String getPanierID() {
        return carritoID;
    }

    public void setPanierID(String carritoID) {
        this.carritoID = carritoID;
    }

    public String getUtilisateurEmail() {
        return usuarioEmail;
    }

    public void setUtilisateurEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public ArrayList<Integer> getProduitPanier() {
        return productoPanier;
    }

    public void setProduitPanier(ArrayList<Integer> productoPanier) {
        this.productoPanier = productoPanier;
    }

    public ArrayList<Integer> getExistenciaProduitPanier() {
        return existenciaProduitPanier;
    }

    public void setExistenciaProduitPanier(ArrayList<Integer> existenciaProduitPanier) {
        this.existenciaProduitPanier = existenciaProduitPanier;
    }

    public double getTotalPanier() {
        return totalPanier;
    }

    public void setTotalPanier(double totalPanier) {
        this.totalPanier = totalPanier;
    }
    private String carritoID;
    private String usuarioEmail;
    private ArrayList<Integer> productoPanier = new ArrayList<>();
    private ArrayList<Integer> existenciaProduitPanier = new ArrayList<>();
    private double totalPanier;
    
    
    
}
