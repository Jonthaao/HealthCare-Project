package com.br.FinalJayme.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.dto.MedicoDto;
import com.br.FinalJayme.entities.Medico;
import com.br.FinalJayme.services.MedicoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/trilha")
public class MedicoController {

    @Autowired
    MedicoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<MedicoDto>> listar() {
        return new ResponseEntity<>(service.lista(), HttpStatus.OK);
    }

    @PostMapping("/novaTrilha")
    public ResponseEntity<String> cadastrar(Medico trilha) {
        return new ResponseEntity<>(service.cadastro(trilha), HttpStatus.OK);
    }

}
