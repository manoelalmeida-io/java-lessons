/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.media;

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
    }
    
    public void exibirBoletim() {
        
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

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
