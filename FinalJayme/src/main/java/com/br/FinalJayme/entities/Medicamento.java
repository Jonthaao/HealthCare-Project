package com.br.FinalJayme.entities;

import java.util.List;

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
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "medicamento_faturamento", joinColumns = @JoinColumn(name = "medicamento_id"), inverseJoinColumns = @JoinColumn(name = "faturamento_id"))
    List<Faturamento> faturamentos;

    // N medicamentos para N prescricoes
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "medicamento_prescricao", joinColumns = @JoinColumn(name = "medicamento_id"), inverseJoinColumns = @JoinColumn(name = "prescricao_id"))
    List<Prescricao> prescricoes;
    
    private String nome;
    private String descricao;
    private Double valor;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Faturamento> getFaturamento() {
        return faturamentos;
    }
    public void setFaturamento(List<Faturamento> faturamento) {
        this.faturamentos = faturamento;
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
