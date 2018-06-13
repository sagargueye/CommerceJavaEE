/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author p1623082
 */
public class commandeexception extends Exception {
     public commandeexception()
    {
        super("La quantité minimal d'une commande doit etre egal a zero");
    }
}
