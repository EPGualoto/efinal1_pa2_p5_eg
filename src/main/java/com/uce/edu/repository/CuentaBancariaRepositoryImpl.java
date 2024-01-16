package com.uce.edu.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.ComisionTransferencia;
import com.uce.edu.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public CuentaBancaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CuentaBancaria cb = this.seleccionar(id);
		this.entityManager.remove(cb);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public CuentaBancaria transferencia(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//Buscar Transferencia con esa cuenta de origen
		Query myQuery = this.entityManager.createQuery("SELECT cb FROM CuentaBancaria cb WHERE cb.cuentaOrigen = : numero");
		myQuery.setParameter("numero", cuentaOrigen);
		return (CuentaBancaria) this.entityManager.merge(myQuery) ;
	}

}
