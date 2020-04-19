/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.media;

/**
 *
 * @author manoe
 */
public class ProgramaAluno {
    
    public static void main(String[] args) {
        
        Aluno manoel = new Aluno(1192021, "Manoel Almeida");
        manoel.adiciona(new Disciplina("Sistemas Operacionais", 10.0, 10.0, 0));
        manoel.adiciona(new Disciplina("Linguagem de programação", 10.0, 10.0, 0));
        manoel.adiciona(new Disciplina("Pesquisa e inovação", 10.0, 10.0, 0));
        manoel.adiciona(new Disciplina("Socioemocional", 10.0, 10.0, 0));
        
        manoel.exibirBoletim();
    }
}
