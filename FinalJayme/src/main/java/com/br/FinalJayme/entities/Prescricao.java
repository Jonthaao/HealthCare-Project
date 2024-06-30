package com.br.FinalJayme.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Prescricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data;

    //N precriações para 1 paciente
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente;  

    //N precrições para N medicamentos
    @JsonIgnore
    @ManyToMany(mappedBy = "prescricoes", fetch = FetchType.EAGER)
    List<Medicamento> medicamentos;
   
    //N médicos podemm ter N precrições
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "prescricao_medico", joinColumns = @JoinColumn(name = "prescricao_id"), inverseJoinColumns = @JoinColumn(name = "medico_id"))
    List<Medico> medicos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }



}
