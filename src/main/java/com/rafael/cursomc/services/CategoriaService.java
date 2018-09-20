package com.rafael.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.cursomc.domain.Categoria;
import com.rafael.cursomc.respositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository rep;
	
	public Categoria buscar(Integer id) {
			Optional<Categoria> obj = rep.findById(id);
			return obj.orElse(null);
	}
}
