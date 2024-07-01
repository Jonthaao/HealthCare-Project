package com.br.FinalJayme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.FinalJayme.entities.Faturamento;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamento, Integer> {
    List<Faturamento> findByPacienteIdAndStatus(int paciente_id, Boolean status);
}
