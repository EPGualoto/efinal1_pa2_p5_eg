package com.uce.edu.service;

import com.uce.edu.modelo.Propietario;

public interface IPropietarioService {
	//CRUD
	public void guardar(Propietario propietario);
		
	public Propietario buscar(Integer id);
		
	public void eliminar(Integer id);
		
	public void actualizar(Propietario propietario);

}
