package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.FinalJayme.dto.PrescricaoDto;
import com.br.FinalJayme.entities.Prescricao;
import com.br.FinalJayme.repository.PrescricaoRepository;

@Service
public class PrescricaoService {

    @Autowired
    PrescricaoRepository repository;

    public String cadastro(Prescricao prescricao) {
        repository.save(prescricao);
        return "Cadastrado com sucesso!";
    }

    public List<PrescricaoDto> listar() {
        List<Prescricao> prescricoes = repository.findAll();
        return prescricoes.stream().map(x -> new PrescricaoDto(x)).collect(Collectors.toList());
    }

    public ResponseEntity<String> deletar(@PathVariable("id") int id) {
        Prescricao prescricao = repository.findById(id).orElse(null);

        if (prescricao != null) {
            repository.delete(prescricao);
            return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Nao encontrado!", HttpStatus.NOT_FOUND);

    }

    public ResponseEntity<String> editar(Prescricao newPrescricao, @PathVariable("id") int id) {
        Prescricao prescricao = repository.findById(id).orElse(null);

        if (prescricao == null) {
            return new ResponseEntity<>("Prescrição não encontrada!", HttpStatus.OK);
        }

        prescricao.setData(newPrescricao.getData());
        prescricao.setPaciente(newPrescricao.getPaciente());
        prescricao.setMedicamentos(newPrescricao.getMedicamentos());
        prescricao.setMedicos(newPrescricao.getMedicos());

        repository.save(prescricao);

        return new ResponseEntity<>("Editado com sucesso!", HttpStatus.OK);
    }

}
