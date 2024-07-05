package com.br.FinalJayme.dto;

import java.util.List;

import com.br.FinalJayme.entities.Faturamento;

public class FaturamentoDto {
    private String paciente;
    private Boolean status;
    private int quantidadeMaterial;
    private List<MaterialDto> materiais;
    private int quantidadeProcedimento;
    private List<ProcedimentoDto> procedimentos;
    private int quantidadeMedicamento;
    private List<MedicamentoDto> medicamentos;

    public FaturamentoDto(Faturamento faturamento) {
        this.paciente = faturamento.getPaciente().getNome();
        this.status = faturamento.getStatus();
        this.quantidadeMaterial = faturamento.getQuantidadeMaterial();
        this.materiais = faturamento.getMateriais().stream().map(x -> new MaterialDto(x)).toList();
        this.quantidadeMedicamento = faturamento.getQuantidadeMedicamento();
        this.medicamentos = faturamento.getMedicamentos().stream().map(x -> new MedicamentoDto(x)).toList();
        this.quantidadeProcedimento = faturamento.getQuantidadeProcedimento();
        this.procedimentos = faturamento.getProcedimentos().stream().map(x -> new ProcedimentoDto(x)).toList();

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

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public List<MaterialDto> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<MaterialDto> materiais) {
        this.materiais = materiais;
    }

    public List<MedicamentoDto> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<MedicamentoDto> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<ProcedimentoDto> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<ProcedimentoDto> procedimentos) {
        this.procedimentos = procedimentos;
    }
}
