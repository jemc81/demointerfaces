package com.qualitas.entities;

import java.time.LocalDate;

public class Poliza {
	private int numero;
	LocalDate inicioVigencia;
	LocalDate finVigencia;
	
	public Poliza(int numero,                   
			LocalDate inicioVigencia,
			LocalDate finVigencia
			){
		super();
		this.numero=numero;
		this.inicioVigencia=inicioVigencia;
		this.finVigencia=finVigencia;
	}
	
	public void setNumero(int numero){
		this.numero=numero;
	}
	public int getNumero(){
		return numero;
	}
	public void setInicioVigencia(LocalDate inicioVigencia){
		this.inicioVigencia=inicioVigencia;
	}
	public LocalDate getInicioVigencia(){
		return inicioVigencia;
	}
	public void setFinVigencia(LocalDate finVigencia){
		this.finVigencia=finVigencia;
	}
	public LocalDate getFinVigencia(){
		return finVigencia;
	}
	public String toString(){
		return "Num = "+getNumero();
	}

}
