package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.entities.Medico;

public class AgendamentoDto {
    private String nome;
    private Integer idade;

    public AgendamentoDto(Agendamento participante) {
        this.nome = participante.getNome();
        this.idade = participante.getIdade();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
