/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.business;

import br.com.fbd.acad.model.Aluno;
import br.com.fbd.acad.model.Semestre;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IBusinessSemestre {
    public boolean salvarOuEditar(Semestre aluno);
    public Semestre buscarPorId(int id);
    public List<Semestre> getAll();
}
