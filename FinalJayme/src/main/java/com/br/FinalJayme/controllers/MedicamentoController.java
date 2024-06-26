package com.br.FinalJayme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.dto.MedicamentoDto;
import com.br.FinalJayme.entities.Medicamento;
import com.br.FinalJayme.services.MedicamentoService;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {

    @Autowired
    MedicamentoService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Medicamento medicamento) {
        return new ResponseEntity<>(service.cadastro(medicamento), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<MedicamentoDto>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }
}
