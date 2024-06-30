package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Material;

public class MaterialDto {

    private String nome;
    private String descricao;
    private Double valor;

    public MaterialDto(Material material) {
        this.nome = material.getNome();
        this.descricao = material.getDescricao();
        this.valor = material.getValor();
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
