package com.br.FinalJayme.dto;

import java.util.Date;

import com.br.FinalJayme.entities.Medico;
import com.br.FinalJayme.entities.Prescricao;

public class PrescricaoDto {

    private Medico medico;
    private Date data;
    private String receita;

    public PrescricaoDto(Prescricao prescricao) {
        this.data = prescricao.getData();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

}
