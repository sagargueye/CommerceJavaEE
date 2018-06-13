/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
//pour l'utilisation de la valeur absolue
import static java.lang.Math.abs;

/**
 *
 * @author p1623082
 */
public class produit{
     protected double numproduit;
     protected String nomproduit;
     protected double prixproduit;
     protected String descriptionproduit;
     protected double stockproduit;
    //constructeur vide
    public produit()
    {
        numproduit=0;
        nomproduit=" ";
        prixproduit=0;
        descriptionproduit=" ";
        stockproduit=0;
        
    }
    //constructeur non vide
    public produit (double n, String nom, double p, String d,double s) 
    {
        numproduit=n;
        nomproduit=nom;
        prixproduit=p;
        descriptionproduit=d;
        stockproduit=s;
    }
    // methode affiche produit
    public void afficheproduit(double numproduit)
    {
         System.out.println("numéro "+numproduit+" nom "+nomproduit+" prix "
                 +prixproduit+" description "+descriptionproduit+" stock "+stockproduit);
    }
    //modifier le stock 
    //par exemple lors de l'achat d'un produit , il faut enlever la quantité de produit acheter dans le stcok
    //ou lors de l'approvisionnement, il faut ajouter la quantité 
    //du coup l'argument qtAjouter peut etre negation ou positif, il est de type float
    public double modifstock(float qtAjouter) throws stockexception
    {
      //lors d'un achat   
        if(qtAjouter<0) 
        {  
            //si la quantité a enlevé est inferieur à la quantité du stock
            //dans ce cas faut déclencher l'exception qtstock
            if (abs(qtAjouter)>stockproduit)
            {
                throw new stockexception(stockproduit);
            }else{
                stockproduit=stockproduit+qtAjouter;
            }
        }//lors de l'approvisionnement
        else
        {
            stockproduit=stockproduit+qtAjouter;
        }
         return stockproduit;
    }

    public String getNomproduit() {
        return nomproduit;
    }

    public void setNomproduit(String nomproduit) {
        this.nomproduit = nomproduit;
    }

    public double getPrixproduit() {
        return prixproduit;
    }

    public void setPrixproduit(double prixproduit) {
        this.prixproduit = prixproduit;
    }

    public String getDescriptionproduit() {
        return descriptionproduit;
    }

    public void setDescriptionproduit(String descriptionproduit) {
        this.descriptionproduit = descriptionproduit;
    }

    public double getStockproduit() {
        return stockproduit;
    }

    public void setStockproduit(double stockproduit) {
        this.stockproduit = stockproduit;
    }
    
}
