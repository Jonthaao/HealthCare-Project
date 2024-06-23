package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Procedimento;

public class ProcedimentoDto {

    private String nome;
    private String descricao;

    public ProcedimentoDto(Procedimento procedimento){
        this.nome = procedimento.getNome();
        this.descricao = procedimento.getDescricao();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
