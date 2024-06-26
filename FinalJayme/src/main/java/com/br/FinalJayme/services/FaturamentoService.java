package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.FaturamentoDto;
import com.br.FinalJayme.entities.Faturamento;
import com.br.FinalJayme.repository.FaturamentoRepository;

@Service
public class FaturamentoService {

    @Autowired
    FaturamentoRepository repository;

    public String cadastro(Faturamento faturamento){
        repository.save(faturamento);
        return "Cadastrado com sucesso!";
    }

    public List<FaturamentoDto> lista(){
        List<Faturamento> faturamentos = repository.findAll();
        return faturamentos.stream().map(x -> new FaturamentoDto(x)).collect(Collectors.toList());
    }
    
}
