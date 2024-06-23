package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.entities.Medicamento;
import com.br.FinalJayme.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

    @Autowired
    MedicamentoRepository repository;

    public String cadastro(Medicamento medicamento){
        repository.save(medicamento);
        return "Cadastrado!";
    }

}
