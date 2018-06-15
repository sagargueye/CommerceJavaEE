/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.time.*;

//import gestion_VIP.*;

public class JDBC {

    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@iutdoua-oracle.univ-lyon1.fr:1521:orcl";
    private static final String DB_USER = "p1623082";
    private static final String DB_PASSWORD = "288331";

//    public static void main(String[] argv) {
//
//        try {
//
//            selectFilmFromDB();
//
//        } catch (SQLException e) {
//
//            System.out.println(e.getMessage());
//
//        }
//
//    }
//    
//    

    public static ArrayList selectClientFromDB() throws SQLException {

        ArrayList<client> listclient = new ArrayList<>();
        Connection dbConnection = null;
        Statement statement = null;

        String selectTableSQL = "SELECT * from CLIENT ";

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            System.out.println(selectTableSQL);

//             execute select SQL stetement
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {
                String nom = rs.getString("nomclient");
                String prenom = rs.getString("prenomclient");
                String adresse = rs.getString("adresse");
                String mail = rs.getString("mail");
                //on creer un objet avec les données recuperées depuis la BD
                client c = new client(rs.getInt(1),nom,prenom,
                        adresse,rs.getInt(5),mail,rs.getInt(7));
                //on stock l'objet dans le tableau
                listclient.add(c);
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (statement != null) {
                statement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

        return listclient;

    }

    private static Connection getDBConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
                    DB_PASSWORD);
            return dbConnection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return dbConnection;

    }
    
}
