package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Materiais;
import com.br.FinalJayme.repository.MateriaisRepository;

@Service
public class MateriaisService {

    @Autowired
    MateriaisRepository repository;

    // public List<MateriaisDto> lista() {
    // List<Materiais> materiais = repository.findAll();
    // return materiais.stream().map(x -> new
    // MateriaisDto(x)).collect(Collectors.toList());
    // }

    public String cadastro(Materiais materiais) {
        repository.save(materiais);
        return "Cadastrado com suceso!";
    }

}
