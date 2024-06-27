package com.br.FinalJayme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.dto.PrescricaoDto;
import com.br.FinalJayme.entities.Prescricao;
import com.br.FinalJayme.services.PrescricaoService;

@RestController
@RequestMapping("/prescricao")
public class PrescricaoController {

    @Autowired
    PrescricaoService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Prescricao prescricao) {
        return new ResponseEntity<>(service.cadastro(prescricao), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<PrescricaoDto>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> deletar(@PathVariable("id") int id) {
        return service.deletar(id);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> editar(Prescricao prescricao, @PathVariable("id") int id) {
        return service.editar(prescricao, id);
    }

}
