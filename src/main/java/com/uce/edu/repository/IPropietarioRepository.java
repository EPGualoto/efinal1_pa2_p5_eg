package com.uce.edu.repository;

import com.uce.edu.modelo.Propietario;

public interface IPropietarioRepository {
	//CRUD
	public void insertar(Propietario propietario);
	
	public Propietario seleccionar(Integer id);
	
	public void eliminar(Integer id);
	
	public void actualizar(Propietario propietario);

}
