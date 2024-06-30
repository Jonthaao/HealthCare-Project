package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.FinalJayme.dto.PacienteDto;
import com.br.FinalJayme.entities.Paciente;
import com.br.FinalJayme.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    public String cadastro(Paciente paciente) {
        repository.save(paciente);
        return "Cadastrado com sucesso!";
    }

    public List<PacienteDto> listar() {
        List<Paciente> pacientes = repository.findAll();

        return pacientes.stream().map(x -> new PacienteDto(x)).collect(Collectors.toList());
    }

    public ResponseEntity<String> deletar(@PathVariable("id") int id) {
        Paciente paciente = repository.findById(id).orElse(null);

        if (paciente != null) {
            repository.delete(paciente);
            return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Nao encontrado!", HttpStatus.NOT_FOUND);

    }

    public ResponseEntity<String> editar(Paciente newPaciente, @PathVariable("id") int id) {
        Paciente paciente = repository.findById(id).orElse(null);

        if (paciente == null) {
            return new ResponseEntity<>("Paciente não encontrado!", HttpStatus.OK);
        }
        
        paciente.setCpf(newPaciente.getCpf());
        paciente.setEmail(newPaciente.getEmail());
        paciente.setEndereco(newPaciente.getEndereco());
        paciente.setNome(newPaciente.getNome());
        paciente.setSexo(newPaciente.getSexo());

        repository.save(paciente);

        return new ResponseEntity<>("Editado com sucesso!", HttpStatus.OK);
    }

}
