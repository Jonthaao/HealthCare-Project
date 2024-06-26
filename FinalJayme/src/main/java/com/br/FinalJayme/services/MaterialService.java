package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.MaterialDto;
import com.br.FinalJayme.entities.Material;
import com.br.FinalJayme.repository.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    MaterialRepository repository;

    public List<MaterialDto> lista() {
        List<Material> materiais = repository.findAll();
        return materiais.stream().map(x -> new MaterialDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Material material) {
        repository.save(material);
        return "Cadastrado com suceso!";
    }

}
