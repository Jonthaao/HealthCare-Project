package com.br.FinalJayme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.dto.AgendamentoDto;
import com.br.FinalJayme.entities.Agendamento;
import com.br.FinalJayme.services.AgendamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/participante")
public class AgendamentoController {

    @Autowired
    AgendamentoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<AgendamentoDto>> listar() {
        return new ResponseEntity<>(service.lista(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Agendamento participante){
        return new ResponseEntity<>(service.cadastro(participante), HttpStatus.OK);
    }
}
