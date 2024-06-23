package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Procedimento;
import com.br.FinalJayme.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {

    @Autowired
    ProcedimentoRepository repository;

    public String cadastro(Procedimento procedimento){
        repository.save(procedimento);
        return "Cadastrado com sucesso!";
    }
    
}
