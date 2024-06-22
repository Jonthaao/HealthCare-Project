package com.br.FinalJayme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.FinalJayme.entities.Materiais;

@Repository
public interface MateriaisRepository extends JpaRepository<Materiais, Integer> {

}
