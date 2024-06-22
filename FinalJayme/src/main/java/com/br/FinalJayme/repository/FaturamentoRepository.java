package com.br.FinalJayme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.FinalJayme.entities.Convenio;

@Repository
public interface FaturamentoRepository extends JpaRepository<Convenio, Integer> {

}
