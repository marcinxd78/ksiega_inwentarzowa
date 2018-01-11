/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcin
 */
import javax.swing.JOptionPane;
import java.sql.*;





public class sqlite {

    /**
     *
     * @return
     */
   Connection conn=null;
    public static Connection dbConnector (){
            
            
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:K_II.db"); 
            //JOptionPane.showMessageDialog(null,"Łączenie z bazą");

            return conn;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
         
     }
    

}
