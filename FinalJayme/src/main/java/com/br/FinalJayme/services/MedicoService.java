package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.MedicoDto;
import com.br.FinalJayme.entities.Medico;
import com.br.FinalJayme.repository.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    MedicoRepository repository;

    // public List<MedicoDto> lista() {
    // List<Medico> medicos = repository.findAll();
    // return medicos.stream().map(x -> new
    // MedicoDto(x)).collect(Collectors.toList());
    // }

    public String cadastro(Medico medico) {
        repository.save(medico);
        return "Cadastrado com suceso!";
    }

    // Criando a lista de médicos que buscam as informações no DTO.
    public List<MedicoDto> lista() {
        List<Medico> medicos = repository.findAll();
        return medicos.stream().map(x -> new MedicoDto(x)).collect(Collectors.toList());
    }

}
