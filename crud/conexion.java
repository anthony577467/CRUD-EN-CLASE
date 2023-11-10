/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author USUARIO
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    public static Connection getConection() {
        try {
            String url = "jdbc:mysql://localhost:3306/nombredetubasededatos";
            String user = "tuUsuario";
            String password = "tuContraseña";
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
