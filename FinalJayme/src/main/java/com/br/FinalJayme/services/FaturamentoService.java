package com.br.FinalJayme.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public String calcularTotal(@PathVariable("paciente_id") int paciente_id) {
        List<Faturamento> faturamentos = repository.findByPacienteIdAndStatus(paciente_id, true);

        Double valorTotal = 0.0;

        // Verifica se não há faturamentos para o paciente ou se a lista está vazia
        if (faturamentos == null || faturamentos.isEmpty()) {
            return "Paciente não encontrado ou não possui faturamentos em aberto (status verdadeiro).";
        }

        for (Faturamento faturamento : faturamentos) {
            double valorTotalMaterial = 0.0;
            for (Material material : faturamento.getMateriais()) {
                valorTotalMaterial += material.getValor() * faturamento.getQuantidadeMaterial();
            }

            double valorTotalMedicamento = 0.0;
            for (Medicamento medicamento : faturamento.getMedicamentos()) {
                valorTotalMedicamento += medicamento.getValor() * faturamento.getQuantidadeMedicamento();
            }

            double valorTotalProcedimento = 0.0;
            for (Procedimento procedimento : faturamento.getProcedimentos()) {
                valorTotalProcedimento += procedimento.getValor() * faturamento.getQuantidadeProcedimento();
            }

            valorTotal = valorTotalMaterial + valorTotalMedicamento + valorTotalProcedimento;

        }

        return "O valor total da conta do paciente é R$ " + valorTotal;

    }
}
