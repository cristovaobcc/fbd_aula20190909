/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.dao;

import br.com.fbd.acad.model.Aluno;
import br.com.fbd.acad.sql_util.SQLUtil;
import br.com.fbd.acad.sql_util.SqlConecction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class DaoAluno implements IDaoAluno{
    
    private Connection conexao;
    private PreparedStatement statement;

    @Override
    public boolean salvar(Aluno aluno) {
        
        // pegar a conexão
        try {
            conexao = SqlConecction.getConnectionInstance();
            statement = conexao.prepareStatement(SQLUtil.Aluno.INSERT_ALL);
            statement.setString(1, aluno.getNome()); // corresponde a primeira interrogação!
            statement.setString(2, aluno.getCpf());
            
            return this.statement.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
       
    }
    
     @Override
    public boolean editar(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
