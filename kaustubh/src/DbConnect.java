

import java.awt.Component;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaustubh
 */
public class DbConnect {
    public static Connection connect(){
        Connection conn =null;
        
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form_data?useTimezone=true&serverTimezone=UTC", "root", "");
            Component rootPane = null;
            System.out.println("Connected");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return conn;
    }
        
     /*public Connection con;
    public Statement st;
    public ResultSet rs;
    public DbConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            st = con.createStatement();
            
        }catch(Exception ex){
            System.out.print("Error"+ex);
        }
    
}
    public void getData(){
        try{
            String q= "Select * from form_inspection";
            rs = st.executeQuery(q);
            
        }catch(Exception ex){
            System.out.print(ex);
        }
    }*/
}