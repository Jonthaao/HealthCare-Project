package com.br.FinalJayme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.repository.FaturamentoRepository;

@Service
public class FaturamentoService {

    @Autowired
    FaturamentoRepository repository;

}
