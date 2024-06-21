package com.br.FinalJayme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.FinalJayme.entities.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {

}
