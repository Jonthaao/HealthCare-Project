package com.br.FinalJayme.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tipo;

    // Convênio pode ter vários prontuários
    @JsonIgnore
    @OneToMany(mappedBy = "convenio")
    private List<Prontuario> prontuarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Prontuario> getProntuario() {
        return prontuarios;
    }

    public void setProntuario(List<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }
}
