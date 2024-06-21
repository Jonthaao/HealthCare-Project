package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.br.FinalJayme.dto.AgendamentoDto;
import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepository repository;

    public List<AgendamentoDto> lista() {
        List<Agendamento> participantes = repository.findAll();
        return participantes.stream().map(x -> new AgendamentoDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Agendamento participante) {
        if (participante.isHabilitado() == true) {
            repository.save(participante);
            return "Participante cadastrado com Sucesso!";
        }
        return "Participante não está habilitado para cadastro!";

    }
}
