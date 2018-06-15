/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public ArrayList<Integer> getProductoPanier() {
        return productoPanier;
    }

    public void setProductoPanier(ArrayList<Integer> productoPanier) {
        this.productoPanier = productoPanier;
    }

    public ArrayList<Integer> getExistenciaProductoPanier() {
        return existenciaProductoPanier;
    }

    public void setExistenciaProductoPanier(ArrayList<Integer> existenciaProductoPanier) {
        this.existenciaProductoPanier = existenciaProductoPanier;
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
    private ArrayList<Integer> existenciaProductoPanier = new ArrayList<>();
    private double totalPanier;
    
    
    
}
