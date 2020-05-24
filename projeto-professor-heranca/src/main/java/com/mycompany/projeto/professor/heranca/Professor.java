package com.mycompany.projeto.professor.heranca;

public class Professor {

    private Integer codigo;
    private String nome;
    private Integer horas;
    private Double valorHora;

    public Professor(Integer codigo, String nome, Integer horas, Double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }
    
    public Double calculaSalario() {
        return horas * valorHora * 4.5;
    }

    @Override
    public String toString() {
        return "Professor{" + "codigo=" + codigo + ", nome=" + nome + ", horas=" + horas + ", valorHora=" + valorHora + ", salario=" + calculaSalario() + '}';
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public Double getValorHora() {
        return valorHora;
    }
}
