package com.br.FinalJayme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.repository.PrescricaoRepository;

@RestController
@RequestMapping("/prescrisao")
public class PrescricaoController {

    @Autowired
    PrescricaoRepository service;

}
