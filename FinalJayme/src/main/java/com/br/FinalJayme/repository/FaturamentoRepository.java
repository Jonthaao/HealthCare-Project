package com.br.FinalJayme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.FinalJayme.entities.Faturamento;
import com.br.FinalJayme.entities.Paciente;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamento, Integer> {
    List<Faturamento> findByPacienteIdAndStatus(Paciente id, Boolean status);
}
