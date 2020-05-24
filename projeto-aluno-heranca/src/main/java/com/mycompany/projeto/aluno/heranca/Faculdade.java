package com.mycompany.projeto.aluno.heranca;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private Integer vagas;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        if (listaAlunos.size() < vagas) {
            this.listaAlunos.add(aluno);
        }
    }
    
    public void exibirAlunosMatriculados() {
        if (listaAlunos.size() > 0) {
            for(Aluno aluno : listaAlunos) {
                System.out.println(aluno);
            }
        }
        else {
            System.out.println("A faculdade " + this.nome + " não possui alunos cadastrados");
        }
    }
    
    public String getNome() {
        return nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + ", vagasDisponiveis=" + (vagas - listaAlunos.size()) + ", listaAlunos=" + listaAlunos + '}';
    }
}
