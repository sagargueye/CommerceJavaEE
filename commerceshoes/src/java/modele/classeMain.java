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
public class classeMain {

    
    static ArrayList<client> listeclient;
    
    public static void main(String[] args) {
        client c1= new client(5,"gh","gn","hn",198,"jhg",4);
        try {
       listeclient=JDBC.selectClientFromDB();
        } catch (Exception exp) {

        }
        for (client s : listeclient) {
            double id = s.getNumclient();
            double mdp = s.getMdpsession();
            System.out.println(id + " " + /*Integer.toString(idbd)*/ mdp + "test");
        }
    }
    
        
}
