package com.uce.edu.service;

import java.math.BigDecimal;

import com.uce.edu.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	//CRUD
	public void guardar(CuentaBancaria cuentaBancaria);
		
	public CuentaBancaria buscar(Integer id);
		
	public void eliminar(Integer id);
		
	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscartransferencia(CuentaBancaria cuentaOrigen,CuentaBancaria cuentaDestino, BigDecimal monto );
}
