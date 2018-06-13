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
public class stockexception extends Exception {
     public stockexception(double qtestock)
    {
        super("La quantité en stock n'est pas suffisant."
                + " quantité en stock actuel est :"+qtestock);
    }
}
