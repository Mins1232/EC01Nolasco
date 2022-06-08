package com.idat.EC1Nolasco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC1Nolasco.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
