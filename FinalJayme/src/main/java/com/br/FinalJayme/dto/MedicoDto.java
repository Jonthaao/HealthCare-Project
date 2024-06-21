package com.br.FinalJayme.dto;

import java.util.List;

import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.entities.Medico;

public class MedicoDto {

    private String nome;
    private String nivelDificuldade;
    private List<Agendamento> participante;

    public MedicoDto(Medico trilha) {

        this.nome = trilha.getNome();
        this.nivelDificuldade = trilha.getNivelDificuldade();
        this.participante = trilha.getParticipantes();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public List<Agendamento> getParticipante() {
        return participante;
    }

    public void setParticipante(List<Agendamento> participante) {
        this.participante = participante;
    }

}
