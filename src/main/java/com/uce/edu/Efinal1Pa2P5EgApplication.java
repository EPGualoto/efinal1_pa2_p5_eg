package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.modelo.CuentaBancaria;
import com.uce.edu.modelo.Propietario;
import com.uce.edu.service.ICuentaBancariaService;
import com.uce.edu.service.IPropietarioService;

@SpringBootApplication
public class Efinal1Pa2P5EgApplication implements CommandLineRunner {
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private IPropietarioService propietarioService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5EgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub 
		Propietario p = new Propietario();
		p.setNombre("Erika");
		p.setApellido("Gualoto");
		p.setCedula("1718411745");
		
		Propietario p2 = new Propietario();
		p2.setNombre("Paola");
		p2.setApellido("Gualoto");
		p2.setCedula("1718411737");
		
		CuentaBancaria cb = new CuentaBancaria();
		cb.setNumero("15141845");
		cb.setPropietario(p);
		cb.setSaldo(new BigDecimal(350));
		cb.setTipo("Ahorro");
		
		CuentaBancaria cb2 = new CuentaBancaria();
		cb2.setNumero("101963");
		cb2.setPropietario(p);
		cb2.setSaldo(new BigDecimal(500));
		cb2.setTipo("Corriente");
		
		this.cuentaBancariaService.guardar(cb);
		this.cuentaBancariaService.guardar(cb2);
		
		this.cuentaBancariaService.buscartransferencia(cb, cb2, new BigDecimal(30));

		CuentaBancaria o = this.cuentaBancariaService.buscar(1);
		System.out.println(o);
		
		CuentaBancaria d = this.cuentaBancariaService.buscar(2);
		System.out.println(d);
	}

}
