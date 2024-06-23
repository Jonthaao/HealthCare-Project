package com.br.FinalJayme.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String especialidade;
    private String crm;
    @OneToMany(mappedBy = "medico")
    private List<Agendamento> agendamentos;
    @OneToMany(mappedBy = "medico")
    private List<Prescricao> prescricoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Agendamento> getAgendamento() {
        return agendamentos;
    }

    public void setAgendamento(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public List<Prescricao> getPrescricao() {
        return prescricoes;
    }

    public void setPrescricao(List<Prescricao> prescricoes) {
        this.prescricoes = prescricoes;
    }
}