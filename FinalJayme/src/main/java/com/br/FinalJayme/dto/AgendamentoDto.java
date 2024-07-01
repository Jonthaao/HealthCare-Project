package com.br.FinalJayme.dto;

import java.util.Date;

import com.br.FinalJayme.entities.Agendamento;

public class AgendamentoDto {

    private String paciente;
    private Date data;
    private String hora;
    private boolean disponibilidade;
    private String medico;

    public AgendamentoDto(Agendamento agendamento) {
        this.paciente = agendamento.getPaciente().getNome();
        this.data = agendamento.getData();
        this.hora = agendamento.getHora();
        this.disponibilidade = agendamento.isDisponibilidade();
        this.medico = agendamento.getMedico().getNome();
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

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

}
