package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FinalJayme.dto.FaturamentoDto;
import com.br.FinalJayme.entities.Faturamento;
import com.br.FinalJayme.entities.Material;
import com.br.FinalJayme.entities.Medicamento;
import com.br.FinalJayme.entities.Procedimento;
import com.br.FinalJayme.repository.FaturamentoRepository;
import com.br.FinalJayme.repository.PacienteRepository;

@Service
public class FaturamentoService {

    @Autowired
    FaturamentoRepository repository;

    @Autowired
    PacienteRepository repository2;

    public String cadastro(Faturamento faturamento) {
        repository.save(faturamento);
        return "Cadastrado com sucesso!";
    }

    public List<FaturamentoDto> listar() {
        List<Faturamento> faturamentos = repository.findAll();
        return faturamentos.stream().map(x -> new FaturamentoDto(x)).collect(Collectors.toList());
    }

    public Double calcularTotal(Faturamento faturamento) {
        
        double valorTotalMaterial = 0.0;
        for (Material material : faturamento.getMateriais()) {
            valorTotalMaterial += material.getValor()*faturamento.getQuantidadeMaterial();
        }

        double valorTotalMedicamento = 0.0;
        for (Medicamento medicamento : faturamento.getMedicamentos()) {
            valorTotalMedicamento += medicamento.getValor()*faturamento.getQuantidadeMedicamento();
        }

        double valorTotalProcedimento = 0.0;
        for (Procedimento procedimento : faturamento.getProcedimentos()) {
            valorTotalProcedimento += procedimento.getValor()*faturamento.getQuantidadeProcedimento();
        }

        Double valorTotalFaturamento = valorTotalMaterial + valorTotalMedicamento + valorTotalProcedimento;

        return valorTotalFaturamento;

    }

}
