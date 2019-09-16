/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.business;

import br.com.fbd.acad.dao.DaoAluno;
import br.com.fbd.acad.excecoes.AcadException;
import br.com.fbd.acad.model.Aluno;
import java.util.List;
import br.com.fbd.acad.dao.IDaoAluno;

/**
 *
 * @author cristovao
 */
public class BusinessAluno implements IBusinessAluno{
    
    private IDaoAluno daoAluno;
    
    public BusinessAluno(){
        this.daoAluno = new  DaoAluno();
    }

    @Override
    public boolean salvarOuEditar(Aluno aluno) throws AcadException{
        if (aluno.getNome().split(" ").length <= 1) {
            throw new AcadException("Nome deve conter pelo menos nome e sobrenome");
        }
        if (aluno.getId()==null) {
           return this.daoAluno.salvar(aluno);
        }
        return false;
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
