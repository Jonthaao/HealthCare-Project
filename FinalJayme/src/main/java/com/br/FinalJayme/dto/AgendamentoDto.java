package com.br.FinalJayme.dto;

import java.util.Date;

import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.entities.Paciente;

public class AgendamentoDto {

    private Date data;
    private String hora;
    private boolean disponibilidade;
    private Paciente pacienteDto;

    public AgendamentoDto(Agendamento agendamento) {
        this.data = agendamento.getData();
        this.hora = agendamento.getHora();
        this.disponibilidade = agendamento.isDisponibilidade();
        this.pacienteDto = agendamento.getPaciente();
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

    public Paciente getPacienteDto() {
        return pacienteDto;
    }

    public void setPacienteDto(Paciente pacienteDto) {
        this.pacienteDto = pacienteDto;
    }

}
