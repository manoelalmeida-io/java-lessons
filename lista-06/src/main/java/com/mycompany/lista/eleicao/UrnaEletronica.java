package com.mycompany.lista.eleicao;

public class UrnaEletronica {
    
    private Integer totalCandidato1 = 0;
    private Integer totalCandidato2 = 0;
    private Boolean encerrado = false;
    
    public void votarCandidato1() {
        if(!encerrado)
            totalCandidato1++;
    }
    
    public void votarCandidato2() {
        if(!encerrado)
            totalCandidato2++;
    }
    
    public void encerrarEleicoes() {
        encerrado = true;
    }

    public Integer getTotalCandidato1() {
        return totalCandidato1;
    }

    public Integer getTotalCandidato2() {
        return totalCandidato2;
    }
    
    public Integer getTotalVotos() {
        return totalCandidato1 + totalCandidato2;
    }
}
