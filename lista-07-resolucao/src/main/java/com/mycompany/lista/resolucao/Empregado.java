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
public class Empregado {
    private String nome;
    private String cargo;
    private Double salario;

    public Empregado() {
        this.nome = "";
        this.cargo = "";
        this.salario = 0.0;
    }
    
    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void reajustarSalario(Integer porcentagem) {
        this.salario += this.salario * porcentagem / 100; 
    }
    
    public void imprimir() {
        System.out.println("==================================");
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Cargo: %s", this.cargo));
        System.out.println(String.format("Salário: R$%.2f", this.salario));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
