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

    public Panier(String PanierID, String UtilisateurEmail, double totalPanier) {
        this.PanierID = PanierID;
        this.UtilisateurEmail = UtilisateurEmail;
        this.totalPanier = totalPanier;
    }

   

    public String getPanierID() {
        return PanierID;
    }

    public void setPanierID(String PanierID) {
        this.PanierID = PanierID;
    }

    public String getUtilisateurEmail() {
        return UtilisateurEmail;
    }

    public void setUtilisateurEmail(String UtilisateurEmail) {
        this.UtilisateurEmail = UtilisateurEmail;
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
    private String PanierID;
    private String UtilisateurEmail;
    private ArrayList<Integer> productoPanier = new ArrayList<>();
    private ArrayList<Integer> existenciaProduitPanier = new ArrayList<>();
    private double totalPanier;
    
    
    
}
