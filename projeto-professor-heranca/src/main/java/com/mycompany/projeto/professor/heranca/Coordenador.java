package com.mycompany.projeto.professor.heranca;

public class Coordenador extends Professor {

    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(Integer codigo, String nome, Integer horas, Double valorHora, Integer qtdHorasCoord, Double valorHoraCoord, String curso) {
        super(codigo, nome, horas, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    @Override
    public Double calculaSalario() {
        return super.calculaSalario() + qtdHorasCoord * valorHoraCoord * 4.5;
    }

    @Override
    public String toString() {
        return super.toString() + " Coordenador{" + "qtdHorasCoord=" + qtdHorasCoord + ", valorHoraCoord=" + valorHoraCoord + ", curso=" + curso + '}';
    }
}
