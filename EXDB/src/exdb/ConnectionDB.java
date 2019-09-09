/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdb;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class ConnectionDB {
    public static Connection con(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection Con =DriverManager.getConnection("jdbc:sqlite:D:\\Desktop\\transaction_DB.db");
        System.out.println("is concted Data Base.........");
        return Con;
        
        
    }catch(Exception e ){
     JOptionPane.showConfirmDialog(null, e);
        
    }
    return null;
    }
    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ConnectionDB.con();
    }
    
}
