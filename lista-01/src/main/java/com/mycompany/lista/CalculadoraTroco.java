/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CalculadoraTroco {

    public static void main(String[] args) {

        Double valorUnitario, valorPago, troco;
        Integer qtdVendida;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor unitário do produto: ");
        valorUnitario = leitor.nextDouble();

        System.out.println("Quantidade vendida: ");
        qtdVendida = leitor.nextInt();

        System.out.println("Valor pago pelo clinte: ");
        valorPago = leitor.nextDouble();

        troco = valorPago - valorUnitario * qtdVendida;

        System.out.println("Seu troco será: " + troco);
    }
}
