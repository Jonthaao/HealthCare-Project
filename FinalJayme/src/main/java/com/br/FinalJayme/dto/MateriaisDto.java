package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Materiais;

public class MateriaisDto {

    private String nome;
    private String descricao;
    private Double valor;

    public MateriaisDto(Materiais materiais) {
        this.nome = materiais.getNome();
        this.descricao = materiais.getDescricao();
        this.valor = materiais.getValor();
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
