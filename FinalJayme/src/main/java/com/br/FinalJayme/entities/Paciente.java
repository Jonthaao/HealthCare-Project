package com.br.FinalJayme.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String sexo;

    // Um paciente pode ter vários agendamentos
    @JsonIgnore
    @OneToMany(mappedBy = "paciente")
    private List<Agendamento> agendamentos;

    // Um paciente pode ter várias precrições.
    @JsonIgnore
    @ManyToMany(mappedBy = "pacientes", fetch = FetchType.EAGER)
    private List<Prescricao> prescricoes;

    // Um paciente pode ter vários faturamentos.
    @JsonIgnore
    @OneToMany(mappedBy = "paciente")
    private List<Faturamento> faturamentos;

    @JsonIgnore
    @OneToMany(mappedBy = "paciente")
    private List<Prontuario> prontuarios;

    public Paciente() {
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public List<Faturamento> getFaturamento() {
        return faturamentos;
    }

    public void setFaturamento(List<Faturamento> faturamentos) {
        this.faturamentos = faturamentos;
    }

}
