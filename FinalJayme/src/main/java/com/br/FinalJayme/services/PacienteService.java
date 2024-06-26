package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.PacienteDto;
import com.br.FinalJayme.entities.Paciente;
import com.br.FinalJayme.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    public String cadastro(Paciente paciente) {
        repository.save(paciente);
        return "Cadastrado com sucesso!";
    }

    public List<PacienteDto> listar() {
        List<Paciente> pacientes = repository.findAll();

        return pacientes.stream().map(x -> new PacienteDto(x)).collect(Collectors.toList());
    }

}
