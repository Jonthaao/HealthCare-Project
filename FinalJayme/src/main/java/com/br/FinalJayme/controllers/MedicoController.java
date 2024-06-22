package com.br.FinalJayme.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FinalJayme.services.MedicoService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    MedicoService service;

}
