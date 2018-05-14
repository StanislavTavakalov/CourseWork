/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Swyatoslaw
 */
public class Searcher {

    private final static String ADMIN_LOGIN = "admin";
    private final static String ADMIN_PASS = "Qwe123";

    public static void connect(String enterLogin, String enterPass) {
    }

    public static boolean searchLogin(String enterLogin, String enterPass){
        String db = "jdbc:mysql://localhost:3306/accounts";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db,"root","root"); Statement st = cn.createStatement()) {
               
                ResultSet rs = st.executeQuery("select * from accounts where name='" + enterLogin + "' and password='" + enterPass + "'");
               // st.executeQuery("insert into accounts values('stasp','123'");
                return rs.next();
            }

        } catch (SQLException ex) {
            
            return false;
        }
        
         catch (ClassNotFoundException ex) {
            
            return false;
        }
       //return ADMIN_LOGIN.equals(enterLogin)&& ADMIN_PASS.equals(enterPass);
//    }
    }
}

