/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Swyatoslaw
 */
public class Registrar {

    public static boolean registerLogin(String enterLogin, String enterPass) {

 
        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {

                ResultSet rs = st.executeQuery("select * from accounts where name='" + enterLogin + "'");
                if (!rs.next()) {
                    PreparedStatement ps = cn.prepareStatement("INSERT INTO accounts(name, password) VALUES(?,?)");
                    ps.setString(1, enterLogin);
                    ps.setString(2, enterPass);
                    ps.executeUpdate();
                    return true;
                }
                return false;
            }

        } catch (SQLException ex) {

            return false;
        } catch (ClassNotFoundException ex) {

            return false;
        }
    }
}

