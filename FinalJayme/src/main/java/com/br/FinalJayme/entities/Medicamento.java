package com.br.FinalJayme.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // N medicamentos para N faturamentos
<<<<<<< HEAD
    @JsonIgnore
    @ManyToMany(mappedBy = "medicamentos")
    private List<Faturamento> faturamentos;

    // N medicamentos para N prescricoes
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "medicamento_prescricao", joinColumns = @JoinColumn(name = "medicamento_id"), inverseJoinColumns = @JoinColumn(name = "prescricao_id"))
    List<Prescricao> prescricoes;
=======
    @ManyToMany(mappedBy = "medicamentos")
    private List<Faturamento> faturamentos;

    // N medicamentos para N prescricoes
    @ManyToMany(mappedBy = "medicamentos", fetch = FetchType.EAGER)
    private List<Prescricao> prescricoes;
>>>>>>> 266c818c07fb6441ad2d43f070aa80ff526c54ac

    private String nome;
    private String descricao;
    private Double valor;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
<<<<<<< HEAD

    public List<Faturamento> getFaturamento() {
        return faturamentos;
    }

    public void setFaturamentos(List<Faturamento> faturamento) {
        this.faturamentos = faturamentos;
=======
    public List<Faturamento> getFaturamentos() {
        return faturamentos;
    }
    public void setFaturamentos(List<Faturamento> faturamentos) {
        this.faturamentos = faturamentos;
>>>>>>> 266c818c07fb6441ad2d43f070aa80ff526c54ac
    }

    public List<Prescricao> getPrescricoes() {
        return prescricoes;
    }

    public void setPrescricoes(List<Prescricao> prescricoes) {
        this.prescricoes = prescricoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
