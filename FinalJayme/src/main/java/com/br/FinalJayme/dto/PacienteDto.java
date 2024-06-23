package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Paciente;

public class PacienteDto {

    private String nome;
    private String cpf;

    public PacienteDto(Paciente paciente){
        this.nome = paciente.getNome();
        this.cpf = paciente.getCpf();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
