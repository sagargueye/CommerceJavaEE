/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author clases
 */
public class Commande {

   
    public Commande(String CommandeID, Panier carritoCommandedo,Timestamp timeStampCommande) {
        this.CommandeID = CommandeID;
        this.carritoCommandedo = carritoCommandedo;
         this.timeStampCommande = timeStampCommande;
    }

    public String getCommandeID() {
        return CommandeID;
    }

    public void setCommandeID(String CommandeID) {
        this.CommandeID = CommandeID;
    }

    public Panier getPanierCommandedo() {
        return carritoCommandedo;
    }

    public void setPanierCommandedo(Panier carritoCommandedo) {
        this.carritoCommandedo = carritoCommandedo;
    }
    
    private String CommandeID;
    private Panier carritoCommandedo;

    public Timestamp getTimeStampCommande() {
        return timeStampCommande;
    }

    public void setTimeStampCommande(Timestamp timeStampCommande) {
        this.timeStampCommande = timeStampCommande;
    }
    private Timestamp timeStampCommande;
}
