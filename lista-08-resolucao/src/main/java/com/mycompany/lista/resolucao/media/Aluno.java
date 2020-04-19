/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manoe
 */
public class Aluno {
    
    private Integer ra;
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }
    
    public void exibirBoletim() {
        System.out.println("==========================");
        System.out.println("Aluno: " + nome);
        System.out.println("RA: " + ra);
        
        for (Disciplina disc : disciplinas) {
            System.out.println("--------------------------");
            System.out.println(disc.getNome());
            System.out.println("Nota continuada: " + disc.getNotaContinuada());
            System.out.println("Nota integrada: " + disc.getNotaSemestral());
            System.out.println("Faltas: " + disc.getQuantFalta());
            System.out.println("Média final: " + disc.getMedia());
            System.out.println(String.format("Situação: %s", disc.getAprovado() ? "Aprovado" : "Reprovado"));
            
        }
    }
    
    public void adiciona(Disciplina d) {
        disciplinas.add(d);
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
