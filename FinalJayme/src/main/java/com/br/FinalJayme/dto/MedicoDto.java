package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Medico;

public class MedicoDto {

    private String nome;
    private String especialidade;

    public MedicoDto(Medico medico){
        this.nome = medico.getNome();
        this.especialidade = medico.getEspecialidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    

}
