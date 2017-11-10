package com.qualitas.dao.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.PolizaDAO;
import com.qualitas.entities.Poliza;

public class PolizaDAOImpl implements PolizaDAO {

	@Override
	public List<Poliza> damePolizas() {

        List<Poliza> lista = new ArrayList<Poliza>();
        for (int i=0;i<10;i++){
        	int numero = (int)(Math.random()*100000);
        	Poliza poliza = new Poliza(numero,LocalDate.now(),LocalDate.now());
        	lista.add(poliza);
        }
		return lista;
	}

}
