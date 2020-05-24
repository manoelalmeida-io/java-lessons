package com.mycompany.projeto.aluno.heranca;

public class Aluno {
    
    private Integer ra;
    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }
    
    public Double calculaMedia() {
        return this.notaContinuada * 0.4 + notaSemestral * 0.6;
    }

    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + '}';
    }
}
