package com.br.FinalJayme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.dto.PacienteDto;
import com.br.FinalJayme.entities.Paciente;
import com.br.FinalJayme.services.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/aventura")
public class PacienteController {

    @Autowired
    PacienteService service;

    @GetMapping("/lista")
    public ResponseEntity<List<PacienteDto>> listar() {
        return new ResponseEntity<>(service.lista(), HttpStatus.OK);
    }

    @PostMapping("/novaAventura")
    public ResponseEntity<String> cadastrar(Paciente aventura) {
        return new ResponseEntity<>(service.cadastro(aventura), HttpStatus.OK);
    }

}
