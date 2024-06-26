package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.AgendamentoDto;
import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepository repository;

    public String cadastro(Agendamento agendamento) {
        repository.save(agendamento);
        return "Cadastrado com sucesso!";
    }

    public List<AgendamentoDto> listar() {
        List<Agendamento> agendamentos = repository.findAll();
        return agendamentos.stream().map(x -> new AgendamentoDto(x)).collect(Collectors.toList());
    }



}
