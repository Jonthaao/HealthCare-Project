package com.br.FinalJayme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.entities.Procedimento;
import com.br.FinalJayme.services.ProcedimentoService;

@RestController
@RequestMapping("/procedimento")
public class ProcedimentoController {

    @Autowired
    ProcedimentoService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Procedimento procedimento) {
        return new ResponseEntity<>(service.cadastro(procedimento), HttpStatus.OK);
    }

}
