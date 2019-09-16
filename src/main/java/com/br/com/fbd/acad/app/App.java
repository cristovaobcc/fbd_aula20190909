/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.app;

import br.com.fbd.acad.business.BusinessAluno;
import br.com.fbd.acad.business.BusinessSemestre;
import br.com.fbd.acad.business.IBusinessAluno;
import br.com.fbd.acad.business.IBusinessSemestre;
import br.com.fbd.acad.excecoes.AcadException;
import br.com.fbd.acad.fachada.Fachada;
import br.com.fbd.acad.fachada.IFachada;
import br.com.fbd.acad.model.Aluno;
import br.com.fbd.acad.model.Semestre;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristovao
 */
public class App {
    public static void main(String[] args) {
        
        IFachada fachada = Fachada.getInstance();
        
        Aluno a = new Aluno("Heldon Jose", "050");
        Semestre s1 = new Semestre();
        try {
            fachada.salvarOuEditarAluno(a);
//            fachada.salvarOuEditarSemestre(s1);
        } catch (AcadException ex) {
            ex.printStackTrace();
        }
        
        IBusinessSemestre businessSemestre =  new BusinessSemestre();
        
        businessSemestre.salvarOuEditar(s1);
        
    }
}
