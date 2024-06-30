package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Faturamento;
import com.br.FinalJayme.entities.Paciente;


public class FaturamentoDto {

    private Boolean status;
    private int quantidadeMaterial;
    private int quantidadeProcedimento;
    private int quantidadeMedicamento;
    private Paciente paciente;

    public FaturamentoDto(Faturamento faturamento){
        this.status = faturamento.getStatus();
        this.paciente = faturamento.getPaciente();
        this.quantidadeMaterial = faturamento.getQuantidadeMaterial();
        this.quantidadeMedicamento = faturamento.getQuantidadeMedicamento();
        this.quantidadeProcedimento = faturamento.getQuantidadeProcedimento();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getQuantidadeMaterial() {
        return quantidadeMaterial;
    }

    public void setQuantidadeMaterial(int quantidadeMaterial) {
        this.quantidadeMaterial = quantidadeMaterial;
    }

    public int getQuantidadeProcedimento() {
        return quantidadeProcedimento;
    }

    public void setQuantidadeProcedimento(int quantidadeProcedimento) {
        this.quantidadeProcedimento = quantidadeProcedimento;
    }

    public int getQuantidadeMedicamento() {
        return quantidadeMedicamento;
    }

    public void setQuantidadeMedicamento(int quantidadeMedicamento) {
        this.quantidadeMedicamento = quantidadeMedicamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}

