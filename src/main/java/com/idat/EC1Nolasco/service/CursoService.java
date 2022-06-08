package com.idat.EC1Nolasco.service;

import java.util.List;

import com.idat.EC1Nolasco.model.Curso;



public interface CursoService {
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);
	List<Curso>listarCurso();
	Curso obtenerCursoId(Integer id);
}
