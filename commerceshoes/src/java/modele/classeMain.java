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
    //methode pour verifier la données entrées parv l'utilisateur avec la base de donner
        public static boolean verifyconnextion (String id, String mdp){
            
            try {
            listeclient=JDBC.selectClientFromDB();
             } catch (Exception exp) {

             }
            for (client s : listeclient) {
                //double idbd = s.getNumclient();
                double mdpbd = s.getMdpsession();
                String idbd = String.valueOf(s.getNumclient());
                if(id.equals(idbd) && mdp.equals(mdpbd)){
                    return true;
                }
            }

            return false;
        }
}
