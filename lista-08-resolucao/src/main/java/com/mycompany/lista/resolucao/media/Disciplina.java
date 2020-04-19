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
        
        this.media = notaContinuada * 0.4 + notaIntegrada * 0.6;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(Double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }

    public Integer getQuantFalta() {
        return quantFalta;
    }

    public void setQuantFalta(Integer quantFalta) {
        this.quantFalta = quantFalta;
    }

    public Boolean getAprovado() {
        return aprovado;
    }
    
    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}
