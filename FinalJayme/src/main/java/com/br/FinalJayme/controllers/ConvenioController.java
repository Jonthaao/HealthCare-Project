package com.br.FinalJayme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.dto.ConvenioDto;
import com.br.FinalJayme.entities.Convenio;
import com.br.FinalJayme.services.ConvenioService;

@RestController
@RequestMapping("/convenio")
public class ConvenioController {

    @Autowired
    ConvenioService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Convenio convenio) {
        return new ResponseEntity<>(service.cadastro(convenio), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<ConvenioDto>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }
}
