package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepository repository;

    public String cadastro(Agendamento agendamento){
        repository.save(agendamento);
        return "Cadastrado com sucesso!";
    }

}
