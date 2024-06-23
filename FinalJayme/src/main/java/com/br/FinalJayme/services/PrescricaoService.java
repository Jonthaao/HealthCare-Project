package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Prescricao;
import com.br.FinalJayme.repository.PrescricaoRepository;

@Service
public class PrescricaoService {

    @Autowired
    PrescricaoRepository repository;

    public String cadastro(Prescricao prescricao){
        repository.save(prescricao);
        return "Cadastrado com sucesso!";
    }

}
