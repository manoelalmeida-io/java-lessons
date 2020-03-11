package com.mycompany.projeto.cofrinho;

public class Cofrinho {
    
    Double saldo = 0.0;
    
    void sacar() { saldo = saldo >= 50 ? saldo - 50 : saldo; }
    void depositar() { saldo += 50; }
    void quebrar() { saldo = 0.0; }
    
    void trasferir(Cofrinho conta) { 
        this.saldo -= 50;
        conta.saldo += 50;
    }
}
