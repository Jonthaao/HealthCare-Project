package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Medico;
import com.br.FinalJayme.repository.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    MedicoRepository repository;

    // public List<MedicoDto> lista() {
    //     List<Medico> medicos = repository.findAll();
    //     return medicos.stream().map(x -> new MedicoDto(x)).collect(Collectors.toList());
    // }

    public String cadastro(Medico medico) {
        repository.save(medico);
        return "Cadastrado com suceso!";
    }

}
