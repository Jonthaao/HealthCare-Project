package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Material;
import com.br.FinalJayme.repository.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    MaterialRepository repository;

    // public List<materialDto> lista() {
    // List<material> materiais = repository.findAll();
    // return materiais.stream().map(x -> new
    // materialDto(x)).collect(Collectors.toList());
    // }

    public String cadastro(Material material) {
        repository.save(material);
        return "Cadastrado com suceso!";
    }

}
