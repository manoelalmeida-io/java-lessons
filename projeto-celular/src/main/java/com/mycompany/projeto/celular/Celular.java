package com.mycompany.projeto.celular;

public class Celular {
    
    public Boolean validarNumero(String numero) {
        return numero.matches("^[0-9 \b () -]*$");
    }
}
