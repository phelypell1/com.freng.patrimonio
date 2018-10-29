package com.freng.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MySqlConnection {
    /////Drives da conexao com o Banco de Dados///////
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://192.168.1.9:3306/BancoProducao";
    private static final String USER = "server";
    private static final String PASS = "X01nn@h77M";
    public ResultSet rs;
    public PreparedStatement stmt;
    ///Classe de conexao//
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados. \n " + e.getMessage());
        }

    }
    ///Clase de conexao fecha a porta CON///
     public static void CloseConnection(Connection con){
         try {
             if(con != null){
                 con.close();
             }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao Fechar a conexao 'CON' \n "+e.getMessage());
         }
     }
    ///Clase de conexao fecha a porta CON e STMT/// 
     public static void CloseConnection(Connection con, PreparedStatement stmt){
         CloseConnection(con);
         try {
             if(stmt != null){
                 stmt.close();
             }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao Fechar a conexao 'STMT' \n "+e.getMessage());
         }
     }
     ///Clase de conexao fecha a porta CON, STMT e RS///
     public static void CloseConnection(Connection con, PreparedStatement stmt, ResultSet rs){
         CloseConnection(con, stmt);
         try {
             if(rs != null){
                 rs.close();
             }
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro ao Fechar a conexao 'RS' \n "+e.getMessage());
         }
     }
}
