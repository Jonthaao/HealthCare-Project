package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Prontuario;
import com.br.FinalJayme.repository.ProntuarioRepository;

@Service
public class ProntuarioService {

    @Autowired
    ProntuarioRepository repository;

    public String cadastro(Prontuario prontuario) {
        repository.save(prontuario);
        return "Cadastrado com sucesso!";
    }

}
