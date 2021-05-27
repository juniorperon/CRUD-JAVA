/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.jdbc;

import entity.jdbc.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moreno
 */
public class UsuarioDAO {
    private Connection conn;
    
    public UsuarioDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public boolean autenticar(String login, String senha) {
        Usuario usuario = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from usuario where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
}
