package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;

import com.br.FinalJayme.dto.AgendamentoDto;
import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepository repository;

    public String cadastro(Agendamento agendamento) {
        repository.save(agendamento);

        if (agendamento.isDisponibilidade() == false){
            return "Agenda indisponível";
        }
        
        return "Cadastrado com sucesso!";
    }

    public List<AgendamentoDto> listar() {
        List<Agendamento> agendamentos = repository.findAll();
        return agendamentos.stream().map(x -> new AgendamentoDto(x)).collect(Collectors.toList());
    }

    public ResponseEntity<String> deletar(@PathVariable("id") int id) {
        Agendamento agendamento = repository.findById(id).orElse(null);

        if (agendamento != null) {
            repository.delete(agendamento);
            return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Nao encontrado!", HttpStatus.NOT_FOUND);

    }

    public ResponseEntity<String> editar(Agendamento newAgendamento, @PathVariable("id") int id) {
        Agendamento agendamento = repository.findById(id).orElse(null);

        if (agendamento == null) {
            return new ResponseEntity<>("Agendamento não encontrado!", HttpStatus.OK);
        }

        agendamento.setData(newAgendamento.getData());
        agendamento.setDisponibilidade(newAgendamento.isDisponibilidade());
        agendamento.setHora(newAgendamento.getHora());
        agendamento.setMedico(newAgendamento.getMedico());
        agendamento.setPaciente(newAgendamento.getPaciente());

        repository.save(agendamento);

        return new ResponseEntity<>("Editado com sucesso!", HttpStatus.OK);
    }

}
