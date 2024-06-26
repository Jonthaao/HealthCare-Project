package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

// import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.ConvenioDto;
import com.br.FinalJayme.entities.Convenio;
import com.br.FinalJayme.repository.ConvenioRepository;

@Service
public class ConvenioService {

    @Autowired
    ConvenioRepository repository;

    public List<ConvenioDto> listar() {
        List<Convenio> convenios = repository.findAll();
        return convenios.stream().map(x -> new ConvenioDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Convenio convenio) {
        repository.save(convenio);
        return "Cadastrado com suceso!";
    }

}
