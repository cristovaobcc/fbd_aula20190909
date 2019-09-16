/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.fachada;

import br.com.fbd.acad.excecoes.AcadException;
import br.com.fbd.acad.model.Aluno;
import br.com.fbd.acad.model.Semestre;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IFachada {
    // Aluno
    public boolean salvarOuEditarAluno(Aluno aluno) throws AcadException;
    
    public Aluno buscarAlunoPorId(int id);
    
    public List<Aluno> getAllAluno();
    
    // Semestre
    public boolean salvarOuEditarSemestre(Semestre aluno);
    
    public Semestre buscarSemestrePorId(int id);
    public List<Semestre> getAllSemestres();
}
