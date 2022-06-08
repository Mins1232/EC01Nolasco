package com.idat.EC1Nolasco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC1Nolasco.model.Profesor;
import com.idat.EC1Nolasco.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	@Autowired
	private ProfesorRepository repository;
	@Override
	public void guardarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.save(profesor);
	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(profesor);
	}

	@Override
	public void eliminarProfesor(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Profesor obtenerProfesorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
