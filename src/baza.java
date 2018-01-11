/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcin
 */
import java.sql.*;



public class baza {
    
    public baza(){
    Connection con=null;
    Statement st=null;
    
    ResultSet rs=null;
    
    try  {
    
         Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:K_II.db");
            st=con.createStatement();
    
            rs=st.executeQuery("SELECT * FROM users;");
    
    while(rs.next()){
        int id = rs.getInt("id_user");
        String name = rs.getString("imie"); 
        String nazw = rs.getString("nazwisko"); 
        System.out.println( "ID= " + id );
        System.out.println( "IMIE= " + name );
        System.out.println( "Nazwisko= " + nazw );
        System.out.println();
        
    }
    rs.close();
    st.close();
    con.close();
}catch(Exception e){
    System.out.println("Błąd połączenia");
    }   
}}
