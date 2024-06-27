package com.br.FinalJayme.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Faturamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Prescricao prescricao;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente;

   
    @OneToMany(mappedBy = "faturamento")
    private List<Material> materiais;


    @OneToMany(mappedBy = "faturamento")
    private List<Medicamento> medicamentos;

  
    @OneToMany(mappedBy = "faturamento")
    private List<Procedimento> procedimentos;

    private Double valorTotal;
    private Boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Prescricao getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(Prescricao prescricao) {
        this.prescricao = prescricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Material> getMaterial() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    public List<Medicamento> getMedicamento() {
        return medicamentos;
    }

    public void setMedicamento(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Procedimento> getProcedimento() {
        return procedimentos;
    }

    public void setProcedimento(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
