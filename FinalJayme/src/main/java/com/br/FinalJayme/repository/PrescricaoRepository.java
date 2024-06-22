package com.br.FinalJayme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.FinalJayme.entities.Prescricao;

@Repository
public interface PrescricaoRepository extends JpaRepository<Prescricao, Integer> {

}
