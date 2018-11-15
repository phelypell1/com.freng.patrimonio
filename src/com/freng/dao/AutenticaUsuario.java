package com.freng.dao;

import Connection.ConnectionFactoryUser;
import com.fren.beans.usuarios_beans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phelype
 */
public class AutenticaUsuario {
    
    public void autenticaUser(usuarios_beans user){
        Connection conn = ConnectionFactoryUser.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.prepareStatement("select * from Logins_User where usuario = ? and senha = ?");
            
        } catch (SQLException ex) {
            Logger.getLogger(AutenticaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
