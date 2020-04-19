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
public class Disciplina {
    
    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;
    private Integer quantFalta;
    private Boolean aprovado;
    private Double media;

    public Disciplina(String nome, Double notaContinuada, Double notaSemestral, Integer quantFalta) {
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
        this.quantFalta = quantFalta;
        
        // assumindo que notaSemestral = notaContinuada
        this.media = notaContinuada * 0.4 + notaSemestral * 0.6;
        this.aprovado = (media >= 6.0 && quantFalta <= 15);
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

    public Integer getQuantFalta() {
        return quantFalta;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public Double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Disciplina{" + 
                "nome=" + nome + 
                ", notaContinuada=" + notaContinuada + 
                ", notaSemestral=" + notaSemestral + 
                ", quantFalta=" + quantFalta + 
                ", aprovado=" + aprovado + 
                ", media=" + media + '}';
    }
}
