package com.idat.EC1Nolasco.service;

import java.util.List;


import com.idat.EC1Nolasco.model.Profesor;

public interface ProfesorService {
	void guardarProfesor(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	void eliminarProfesor(Integer id);
	List<Profesor>listarProfesor();
	Profesor obtenerProfesorId(Integer id);
}
