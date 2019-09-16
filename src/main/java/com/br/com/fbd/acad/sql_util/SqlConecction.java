/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.sql_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Faz a conexão com o BD!
 * @author cristovao
 */
public class SqlConecction {
    public static final String NOME_BD_CONNECTION_POSTGRESS = "POSTGRES";
   // public static final String NOME_BD_CONNECTION_MYSQL = "MYSQL";
    
    private static Connection conexao = null;
    
    /**
     * Conexão de banco tem que ter singleton! Teremos que ter uma exceção para
     * cada usuário logado! Ajuda no gerenciamento de seção!
     */
    
    private SqlConecction(){
        
    }
    
    public static Connection getConnectionInstance(){
        try {
            if (conexao == null || conexao.isClosed()) {
                conexao = DriverManager.getConnection(SQLUtil.URL_POSTGRES,
                SQLUtil.USUARIO_POSTGRES, SQLUtil.SENHA_POSTGRES);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlConecction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }
    
    
}
