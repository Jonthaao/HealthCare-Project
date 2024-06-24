package com.br.FinalJayme.dto;

import java.util.Date;

import com.br.FinalJayme.entities.Agendamento;

public class AgendamentoDto {

    private Date data;
    private String hora;
    private boolean disponibilidade;

    public AgendamentoDto(Agendamento agendamento) {
        this.data = agendamento.getData();
        this.hora = agendamento.getHora();
        this.disponibilidade = agendamento.isDisponibilidade();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
