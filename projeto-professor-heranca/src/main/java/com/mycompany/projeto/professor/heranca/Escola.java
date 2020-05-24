package com.mycompany.projeto.professor.heranca;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Escola(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<>();
    }
    
    public void contratarProfessor(Professor p) {
        if (professores.size() < vagas) {
            professores.add(p);
        }
    }
    
    public void exibirProfessores() {
        for (Professor p : professores) {
            System.out.println(p);
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    @Override
    public String toString() {
        return "Escola{" + "nome=" + nome + ", vagas=" + vagas + ", professores=" + professores + '}';
    }
}
