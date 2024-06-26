package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.PrescricaoDto;
import com.br.FinalJayme.entities.Prescricao;
import com.br.FinalJayme.repository.PrescricaoRepository;

@Service
public class PrescricaoService {

    @Autowired
    PrescricaoRepository repository;

    public String cadastro(Prescricao prescricao) {
        repository.save(prescricao);
        return "Cadastrado com sucesso!";
    }

    public List<PrescricaoDto> lista(){
        List<Prescricao> prescricoes = repository.findAll();
        return prescricoes.stream().map(x -> new PrescricaoDto(x)).collect(Collectors.toList());
    }

}
