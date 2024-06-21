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

    public List<MedicoDto> lista(){
        List<Medico> trilhas = repository.findAll();

        return trilhas.stream().map(x -> new MedicoDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Medico trilha){
        repository.save(trilha);
        return "Cadastrado com suceso!";
    }
    
}
