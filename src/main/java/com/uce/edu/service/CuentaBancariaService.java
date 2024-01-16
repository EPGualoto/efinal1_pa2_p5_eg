package com.uce.edu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.CuentaBancaria;
import com.uce.edu.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaService implements ICuentaBancariaService{
	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;
	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.eliminar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public CuentaBancaria buscartransferencia(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino,
			BigDecimal monto) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepository.transferencia(cuentaOrigen, cuentaDestino, monto);
	}

}
