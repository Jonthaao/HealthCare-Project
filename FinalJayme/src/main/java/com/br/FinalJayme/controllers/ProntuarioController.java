package com.br.FinalJayme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.entities.Prontuario;
import com.br.FinalJayme.services.ProntuarioService;

@RestController
@RequestMapping("/prontuario")
public class ProntuarioController {

    @Autowired
    ProntuarioService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Prontuario prontuario) {
        return new ResponseEntity<>(service.cadastro(prontuario), HttpStatus.OK);
    }

}
