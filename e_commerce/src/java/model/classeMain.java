/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author p1623082
 */
public class classeMain {

    
    static ArrayList<client> listeclient;
    
    public static void main(String[] args) {
        boolean r= verifyconnextion("12","12");
        System.out.println(r );
        try {
       listeclient=JDBC.selectClientFromDB();
        } catch (Exception exp) {
               System.out.println("ca marche pas");
        }
        for (client s : listeclient) {
            String id = s.getNumclient();
            String mdp = s.getMdpsession();
            System.out.println(id + "    test  "+ mdp );
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
                String mdpbd = s.getMdpsession();
                String idbd = String.valueOf(s.getNumclient());
                if(id.equals(idbd) && mdp.equals(mdpbd)){
                    
                   System.out.println(" esk ca pasee dans boucle");
                   return true;
                }
            }

            return false;
        }
}
