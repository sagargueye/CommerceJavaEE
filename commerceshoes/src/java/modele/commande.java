/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import static java.lang.Math.abs;

/**
 *
 * @author p1623082
 */
public class commande {
     protected double numcommande;
     protected double prixcommande;
     protected double quantitecommande;
     protected produit numproduitcommande;
     protected client numclientcommande;

    public commande(double numcommande, double prixcommande, double quantitecommande,
            produit numproduitcommande, client numclientcommande) {
        this.numcommande = numcommande;
        this.prixcommande = prixcommande;
        this.quantitecommande = quantitecommande;
        this.numproduitcommande = numproduitcommande;
        this.numclientcommande = numclientcommande;
    }
    //afficher commande

    @Override
    public String toString() {
        return "commande{" + "numcommande=" + numcommande + ", prixcommande=" 
                + prixcommande + ", quantitecommande=" + quantitecommande 
                + ", numproduitcommande=" + numproduitcommande 
                + ", numclientcommande=" + numclientcommande + '}';
    }
    

    //ajouter ou supprimer une qauntité de la commande
    public double modifQuantitecommande(float quantitecommande) throws commandeexception
    {
        
        //enlever qunatité   
        if(quantitecommande<0) 
        {  
            //si la quantité a enlevé est inferieur à la quantité initial
            //dans ce cas faut déclencher l'exception qtstock
            if (abs(quantitecommande)>quantitecommande)
            {
                throw new commandeexception();
            }else{
                quantitecommande=quantitecommande+quantitecommande;
            }
        }//ajouter quantité
        else
        {
           this.quantitecommande += quantitecommande;
        }
        return quantitecommande;
    }
    
    public double getNumcommande() {
        return numcommande;
    }

    public double getPrixcommande() {
        return prixcommande;
    }

        public double getQuantitecommande() {
        return quantitecommande;
    }
        
    public produit getNumproduitcommande() {
        return numproduitcommande;
    }

    public client getNumclientcommande() {
        return numclientcommande;
    }

    public void setQuantitecommande(double quantitecommande) {
        this.quantitecommande = quantitecommande;
    }
    
     
}
