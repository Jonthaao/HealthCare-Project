package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Faturamento;

public class FaturamentoDto {

    private Double valorTotal;
    private Boolean status;

    public FaturamentoDto(Faturamento faturamento){
        this.valorTotal = faturamento.getValorTotal();
        this.status = faturamento.getStatus();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
