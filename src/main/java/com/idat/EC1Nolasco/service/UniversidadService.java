package com.idat.EC1Nolasco.service;

import java.util.List;


import com.idat.EC1Nolasco.model.Universidad;

public interface UniversidadService {
	void guardarUniversidad(Universidad universidad);
	void actualizarUniversidad(Universidad universidad);
	void eliminarUniversidad(Integer id);
	List<Universidad>listarUniversidad();
	Universidad obtenerUniversidadId(Integer id);
}
