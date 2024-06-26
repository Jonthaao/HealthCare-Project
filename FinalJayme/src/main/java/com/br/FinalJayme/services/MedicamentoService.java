package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.MedicamentoDto;
import com.br.FinalJayme.entities.Medicamento;
import com.br.FinalJayme.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

    @Autowired
    MedicamentoRepository repository;

    public String cadastro(Medicamento medicamento) {
        repository.save(medicamento);
        return "Cadastrado!";
    }

    public List<MedicamentoDto> listar() {
        List<Medicamento> medicamentos = repository.findAll();
        return medicamentos.stream().map(x -> new MedicamentoDto(x)).collect(Collectors.toList());
    }

}
