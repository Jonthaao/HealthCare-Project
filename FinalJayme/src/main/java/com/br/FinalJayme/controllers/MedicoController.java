package com.br.FinalJayme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.entities.Medico;
import com.br.FinalJayme.services.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    MedicoService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Medico medico) {
        return new ResponseEntity<>(service.cadastro(medico), HttpStatus.OK);
    }

}
