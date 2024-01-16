package com.uce.edu.repository;

import java.math.BigDecimal;

import com.uce.edu.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	//CRUD
	public void insertar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria seleccionar(Integer id);
	
	public void eliminar(Integer id);
	
	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria transferencia(CuentaBancaria cuentaOrigen,CuentaBancaria cuentaDestino, BigDecimal monto );
}
