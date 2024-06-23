package com.br.FinalJayme.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Prescricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "prescricao", cascade = CascadeType.ALL)
    private Faturamento faturamento;

    //Um paciente pode ter várias precriações
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente;  

    //Uma precrição pode ter vários medicamentos
    @JsonIgnore
    @OneToMany(mappedBy = "prescricao")
    private List<Medicamento> medicamentos;
   
    //Um médico pode ter várias precrições
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Medico medico;
    
    private Date data;

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

    public Faturamento getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Faturamento faturamento) {
        this.faturamento = faturamento;
    }

    public List<Medicamento> getMedicamento() {
        return medicamentos;
    }

    public void setMedicamento(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
