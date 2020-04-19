/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author manoe
 */
public class Historico {
    
    private final Integer dia;
    private final Integer mes;
    private final Integer ano;
    private final Double valor;
    private final String operacao;

    public Historico(Integer dia, Integer mes, Integer ano, Double valor, String operacao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.operacao = operacao;
    }

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getValor() {
        return valor;
    }

    public String getOperacao() {
        return operacao;
    }

    @Override
    public String toString() {
        return "Historico{" + 
                "dia=" + dia + 
                ", mes=" + mes + 
                ", ano=" + ano + 
                ", valor=" + valor + 
                ", operacao=" + operacao + '}';
    }
}
