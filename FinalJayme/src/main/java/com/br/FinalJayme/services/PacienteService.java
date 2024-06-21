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

    public List<PacienteDto> lista() {
        List<Paciente> aventuras = repository.findAll();
        return aventuras.stream().map(x -> new PacienteDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Paciente aventura) {
        repository.save(aventura);
        return "Aventura cadastrada com suceso!";
    }

}
