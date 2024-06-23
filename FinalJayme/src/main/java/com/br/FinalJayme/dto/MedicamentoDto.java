package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Medicamento;

public class MedicamentoDto {

    private String nome;
    private String descricao;
    private Double valor;

    public MedicamentoDto(Medicamento medicamento){
        this.nome = medicamento.getNome();
        this.descricao = medicamento.getDescricao();
        this.valor = medicamento.getValor();
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
