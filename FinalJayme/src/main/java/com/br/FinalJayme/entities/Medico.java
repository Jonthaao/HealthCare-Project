package com.br.FinalJayme.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String nivelDificuldade;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente aventura;

    @OneToMany(mappedBy = "trilha")
    private List<Agendamento> participantes;

    public Medico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Paciente getAventura() {
        return aventura;
    }

    public void setAventura(Paciente aventura) {
        this.aventura = aventura;
    }

    public List<Agendamento> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Agendamento> participantes) {
        this.participantes = participantes;
    }

}