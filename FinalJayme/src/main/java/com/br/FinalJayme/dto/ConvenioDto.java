package com.br.FinalJayme.dto;

import com.br.FinalJayme.entities.Convenio;

public class ConvenioDto {

    private String tipo;

    public ConvenioDto(Convenio convenio){
        this.tipo = convenio.getTipo();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
