/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.fachada;

import br.com.fbd.acad.business.BusinessAluno;
import br.com.fbd.acad.business.BusinessSemestre;
import br.com.fbd.acad.business.IBusinessAluno;
import br.com.fbd.acad.business.IBusinessSemestre;
import br.com.fbd.acad.excecoes.AcadException;
import br.com.fbd.acad.model.Aluno;
import br.com.fbd.acad.model.Semestre;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristovao
 */
public class Fachada implements IFachada {

    private IBusinessAluno businessAluno;
    private IBusinessSemestre businessSemestre;

    private static Fachada instance;

    private Fachada() {
        this.businessAluno = new BusinessAluno();
        this.businessSemestre = new BusinessSemestre();
    }

    public static Fachada getInstance() {
        if (instance == null) {
            instance = new Fachada();
        }
        return instance;
    }

    @Override
    public boolean salvarOuEditarAluno(Aluno aluno) throws AcadException {
        return this.businessAluno.salvarOuEditar(aluno);

    }

    @Override
    public Aluno buscarAlunoPorId(int id) {
        return this.businessAluno.buscarPorId(id);
    }

    @Override
    public List<Aluno> getAllAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean salvarOuEditarSemestre(Semestre aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Semestre buscarSemestrePorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Semestre> getAllSemestres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
