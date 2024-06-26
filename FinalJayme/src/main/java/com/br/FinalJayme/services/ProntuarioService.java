package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.ProntuarioDto;
import com.br.FinalJayme.entities.Prontuario;
import com.br.FinalJayme.repository.ProntuarioRepository;

@Service
public class ProntuarioService {

    @Autowired
    ProntuarioRepository repository;

    public String cadastro(Prontuario prontuario) {
        repository.save(prontuario);
        return "Cadastrado com sucesso!";
    }

    public List<ProntuarioDto> listar() {
        List<Prontuario> prontuarios = repository.findAll();
        return prontuarios.stream().map(x -> new ProntuarioDto(x)).collect(Collectors.toList());
    }

}
