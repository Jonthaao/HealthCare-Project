package com.br.FinalJayme.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Procedimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Faturamento faturamento;
    private String nome;
    private String descricao;
    private Double alor;

    public Procedimento(int id, Faturamento faturamento, String nome, String descricao, Double alor) {
        this.id = id;
        this.faturamento = faturamento;
        this.nome = nome;
        this.descricao = descricao;
        this.alor = alor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Faturamento getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Faturamento faturamento) {
        this.faturamento = faturamento;
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

    public Double getAlor() {
        return alor;
    }

    public void setAlor(Double alor) {
        this.alor = alor;
    }
}
