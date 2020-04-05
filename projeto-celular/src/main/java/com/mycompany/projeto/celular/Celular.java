package com.mycompany.projeto.celular;

public class Celular {
    
    private Integer bateria = 100;
    
    public Boolean validarNumero(String numero) {
        return numero.matches("^[0-9 \b () -]+$");
    }
    
    public String enviarMensagem(String enviada) {
        if (enviada.toLowerCase().matches(".*bom dia.*"))
            return "Bom dia!";
        if (enviada.toLowerCase().matches(".*boa tarde.*"))
            return "Boa tarde!";
        if (enviada.toLowerCase().matches(".*boa noite.*"))
            return "Boa noite!";
        
        return null;
    }
    
    public void descarregar() {
        bateria -= 1;
    }

    public Integer getBateria() {
        return bateria;
    }
}
