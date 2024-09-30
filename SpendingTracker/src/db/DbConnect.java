/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package db;

/**
 *
 * @author Sudarshan
 */
   import java.sql.*;
  import  javax.swing.JOptionPane;



public class DbConnect {
   public static Connection c;
   public static Statement st;
   static{
       try{
           
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false", "<MySQL_USERNAME", "MySQL_PASSWORD");
           st=c.createStatement();
       }
       catch(SQLException e){
          JOptionPane.showMessageDialog(null,e);
          
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           
       }
   }
   
   
    
}
