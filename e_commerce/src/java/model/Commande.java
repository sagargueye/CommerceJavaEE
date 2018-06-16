/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author clases
 */
public class Commande {

   
    public Commande(String CommandeID, Panier PanierCommandedo,Timestamp timeStampCommande) {
        this.CommandeID = CommandeID;
        this.PanierCommandedo = PanierCommandedo;
         this.timeStampCommande = timeStampCommande;
    }

    public String getCommandeID() {
        return CommandeID;
    }

    public void setCommandeID(String CommandeID) {
        this.CommandeID = CommandeID;
    }

    public Panier getPanierCommandedo() {
        return PanierCommandedo;
    }

    public void setPanierCommandedo(Panier PanierCommandedo) {
        this.PanierCommandedo = PanierCommandedo;
    }
    
    private String CommandeID;
    private Panier PanierCommandedo;

    public Timestamp getTimeStampCommande() {
        return timeStampCommande;
    }

    public void setTimeStampCommande(Timestamp timeStampCommande) {
        this.timeStampCommande = timeStampCommande;
    }
    private Timestamp timeStampCommande;
}
