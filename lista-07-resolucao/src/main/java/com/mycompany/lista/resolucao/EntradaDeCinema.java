/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao;

/**
 *
 * @author manoel
 */
public class EntradaDeCinema {
    private Integer hora;
    private Integer sala;
    private Integer valor;
    private String nome;

    public EntradaDeCinema(Integer hora, Integer sala, Integer valor, String nome) {
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }
    
    public Double calculaDesconto(Integer idade, Boolean estudante) {
        Double novoValor;
        
        if (idade < 12) {
            novoValor = desconto(this.valor.doubleValue(), 50); 
        }
        else if (idade <= 15 && estudante) {
            novoValor = desconto(this.valor.doubleValue(), 40); 
        }
        else if (idade <= 20 && estudante) {
            novoValor = desconto(this.valor.doubleValue(), 30); 
        }
        else if (estudante) {
            novoValor = desconto(this.valor.doubleValue(), 20); 
        }
        else {
            novoValor = this.valor.doubleValue();
        }
        
        return calculaDescontoHorario(novoValor);
    }
    
    public Double calculaDescontoHorario(Double valor) {
        return this.hora < 16 ? desconto(valor, 10) : valor;
    }
    
    public void imprimirIngresso(Integer idade, Boolean estudante) {
        System.out.println(" ____ __________________________________");
        System.out.println("|    |                                  |");
        System.out.println("| C  | Nome: " + this.nome.toUpperCase());
        System.out.println("| I  | Horário: " + this.hora + "h");
        System.out.println(String.format("| N  | Valor: R$%.2f", this.calculaDesconto(idade, estudante)));
        System.out.println("| E  | Sala: " + this.sala);
        System.out.println("|____|__________________________________|");
    }
    
    private Double desconto(Double valor, Integer quantidade) {
        return valor - valor * quantidade / 100;
    }
}
