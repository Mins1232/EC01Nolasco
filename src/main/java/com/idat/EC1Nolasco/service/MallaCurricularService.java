package com.idat.EC1Nolasco.service;

import java.util.List;

import com.idat.EC1Nolasco.model.MallaCurricular;


public interface MallaCurricularService {
	void guardarMalla(MallaCurricular malla);
	void actualizarMalla(MallaCurricular malla);
	void eliminarMalla(Integer id);
	List<MallaCurricular>listarMalla();
	MallaCurricular obtenerMallaId(Integer id);
}
