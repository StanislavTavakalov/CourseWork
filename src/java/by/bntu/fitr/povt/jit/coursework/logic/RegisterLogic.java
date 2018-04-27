/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.logic;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterLogic {

    private final static String ADMIN_LOGIN = "admin";
    private final static String ADMIN_PASS = "Qwe123";

    public static boolean checkPasswords(String enterPass, String enterPassConfirm) {
        if (!enterPass.equals(enterPassConfirm)) {
            return false;
        }
        if (enterPass.length() == 0 || enterPassConfirm.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean registerLogin(String enterLogin, String enterPass, String enterPassConfirm) {

        if (!checkPasswords(enterPass, enterPassConfirm)) {
            return false;
        }
        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", ""); Statement st = cn.createStatement()) {

                ResultSet rs = st.executeQuery("select * from accounts where name='" + enterLogin + "'");
                if (!rs.next()) {
                    PreparedStatement ps = cn.prepareStatement("INSERT INTO accounts(name, password) VALUES(?,?)");
                    ps.setString(1, enterLogin);
                    ps.setString(2, enterPass);
                    ps.executeUpdate();
                    return true;
                }

//                
//                ResultSet rs = st.executeQuery("select * from accounts where name='" + enterLogin + "' and password='" + enterPass + "'");
//               // st.executeQuery("insert into accounts values('stasp','123'");
//                return rs.next();
                return false;
            }

        } catch (SQLException ex) {

            return false;
        } catch (ClassNotFoundException ex) {

            return false;
        }
    }
}
