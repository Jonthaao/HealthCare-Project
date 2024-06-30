package com.br.FinalJayme.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Faturamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente;
   
    @JsonIgnore
    @ManyToMany(mappedBy = "faturamentos", fetch = FetchType.EAGER)
    List<Material> materiais;

    @ManyToMany(mappedBy = "faturamentos", fetch = FetchType.EAGER)
    List<Medicamento> medicamentos;

    @ManyToMany(mappedBy = "faturamentos", fetch = FetchType.EAGER)
     List<Procedimento> procedimentos;

    private int quantidadeMaterial;
    private int quantidadeProcedimento;
    private int quantidadeMedicamento;
    private Boolean status;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

}
