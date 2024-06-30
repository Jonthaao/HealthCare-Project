package com.br.FinalJayme.dto;

import java.util.List;

import com.br.FinalJayme.entities.Material;
import com.br.FinalJayme.entities.Medicamento;
import com.br.FinalJayme.entities.Procedimento;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;

public class FaturamentoDto {

    private Double valorTotal;
    private Boolean status;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private List<Material> materiais;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private List<Medicamento> medicamentos;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private List<Procedimento> procedimentos;

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

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

}
