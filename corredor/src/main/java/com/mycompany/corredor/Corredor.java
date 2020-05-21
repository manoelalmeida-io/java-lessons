package com.mycompany.corredor;

public class Corredor {

    private String tipoFisico;
    private String performance;
    private Double tempoMedio;

    public Corredor(String tipoFisico, String performance, Double tempoMedio) {
        this.tipoFisico = tipoFisico;
        this.performance = performance;
        this.tempoMedio = tempoMedio;
    }
    
    public String getTipoFisico() {
        return tipoFisico;
    }

    public String getPerformance() {
        return performance;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }
}
