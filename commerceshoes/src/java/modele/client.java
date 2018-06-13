/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author p1623082
 */
public class client {
     protected double numclient;
     protected String nomclient;
     protected String prenomclient;
     protected String adresse;
     protected double telephone;
     protected String mail;
     protected double mdpsession;
     //une table qui gere les commandes du client
     private ArrayList<commande> listecommande;

    public client(double numclient, String nomclient, String prenomclient, 
            String adresse, double telephone, String mail, double mdpsession) {
        this.numclient = numclient;
        this.nomclient = nomclient;
        this.prenomclient = prenomclient;
        this.adresse = adresse;
        this.telephone = telephone;
        this.mail = mail;
        this.mdpsession = mdpsession;
        //initialisation de la liste des commandes
        listecommande=new ArrayList<commande>();
    }

    //afficher client
    public String toString() {
        return "client{" + "numclient=" + numclient + ", nomclient=" 
                + nomclient + ", prenomclient=" + prenomclient 
                + ", adresse=" + adresse + ", telephone=" + telephone 
                + ", mail=" + mail +'}';
    }
     //afficher la liste des commande du client
    public void afficherlistecommande(double numclient) {
         for(commande c:listecommande)
         c.toString();
    }
    //passer un nouveau commande/ajoute un objet commande a la liste des commandes
    public void ajoutercommande(commande c)
    {
        listecommande.add(c);
    }
    //modifier une commande
    public void modifquantitecommande(commande c, float newquantite)
            throws commandeexception
    {
        c.modifQuantitecommande(newquantite);
    }
    //supprimer une commande
    public void supprimercommande(commande c)
    {
        commande reference;
        for (int i = 0; i < listecommande.size (); i++){
            reference = listecommande.get (i);
            if(c==reference)
            {
                listecommande.remove(c);
            }
        }
    }

    public double getNumclient() {
        return numclient;
    }

    public String getNomclient() {
        return nomclient;
    }

    public String getPrenomclient() {
        return prenomclient;
    }

    public double getMdpsession() {
        return mdpsession;
    }

    public ArrayList<commande> getListecommande() {
        return listecommande;
    }
    
}
