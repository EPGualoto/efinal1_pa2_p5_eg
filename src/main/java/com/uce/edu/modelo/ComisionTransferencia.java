package com.uce.edu.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "comision_transferencia")
public class ComisionTransferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comision_transferencia")
	@SequenceGenerator(name = "seq_comision_transferencia", sequenceName = "seq_comision_transferencia", allocationSize = 1)
	@Column(name = "cotr_id")
	private Integer id;
	
	@Column(name = "cotr_fecha_transferencia")
	private LocalDateTime fechaTransferencia;
	
	@Column(name = "cotr_monto_transferencia")
	private BigDecimal montoTransferencia;
	
	@Column(name = "cotr_comision_transferencia")
	private BigDecimal comisionTransferencia;	
	
	@OneToOne
	@JoinColumn(name = "cotr_id_cuenta_bancaria_origen")
	private CuentaBancaria cuentaBancariaOrigen;
	
	@OneToOne
	@JoinColumn(name = "cotr_id_cuenta_bancaria_destino")
	private CuentaBancaria cuentaBancariaDestino;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public BigDecimal getMontoTransferencia() {
		return montoTransferencia;
	}

	public void setMontoTransferencia(BigDecimal montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}

	public BigDecimal getComisionTransferencia() {
		return comisionTransferencia;
	}

	public void setComisionTransferencia(BigDecimal comisionTransferencia) {
		this.comisionTransferencia = comisionTransferencia;
	}

	public CuentaBancaria getCuentaBancariaOrigen() {
		return cuentaBancariaOrigen;
	}

	public void setCuentaBancariaOrigen(CuentaBancaria cuentaBancariaOrigen) {
		this.cuentaBancariaOrigen = cuentaBancariaOrigen;
	}

	public CuentaBancaria getCuentaBancariaDestino() {
		return cuentaBancariaDestino;
	}

	public void setCuentaBancariaDestino(CuentaBancaria cuentaBancariaDestino) {
		this.cuentaBancariaDestino = cuentaBancariaDestino;
	}
	

}
