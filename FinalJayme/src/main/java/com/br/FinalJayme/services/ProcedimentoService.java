package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.ProcedimentoDto;
import com.br.FinalJayme.entities.Procedimento;
import com.br.FinalJayme.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {

    @Autowired
    ProcedimentoRepository repository;

    public String cadastro(Procedimento procedimento) {
        repository.save(procedimento);
        return "Cadastrado com sucesso!";
    }

    public List<ProcedimentoDto> listar() {
        List<Procedimento> procedimentos = repository.findAll();
        return procedimentos.stream().map(x -> new ProcedimentoDto(x)).collect(Collectors.toList());
    }

}
