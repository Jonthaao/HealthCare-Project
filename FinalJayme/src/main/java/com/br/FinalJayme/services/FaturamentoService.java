package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Faturamento;
import com.br.FinalJayme.repository.FaturamentoRepository;

@Service
public class FaturamentoService {

    @Autowired
    FaturamentoRepository repository;

    public String cadastro(Faturamento faturamento){
        repository.save(faturamento);
        return "Cadastrado com sucesso!";
    }
    
}
