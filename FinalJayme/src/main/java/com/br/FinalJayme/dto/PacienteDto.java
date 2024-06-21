package com.br.FinalJayme.dto;

import java.util.Date;
import java.util.List;

import com.br.FinalJayme.entities.Paciente;
import com.br.FinalJayme.entities.Medico;

public class PacienteDto {

    private String nome;
    private Date data;
    private List<Medico> trilhas;

    public PacienteDto(Paciente aventura) {
        this.nome = aventura.getNome();
        this.data = aventura.getData();
        this.trilhas = aventura.getTrilhas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public List<Medico> getTrilhas() {
        return trilhas;
    }

    public void setTrilhas(List<Medico> trilhas) {
        this.trilhas = trilhas;
    }
}
