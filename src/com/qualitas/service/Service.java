package com.qualitas.service;

import com.qualitas.dao.ClienteDao;
import com.qualitas.dao.PolizaDAO;
import com.qualitas.dao.impl.ClienteDAOImpl;
import com.qualitas.dao.impl.PolizaDAOImpl;
import com.qualitas.entities.Cliente;
import java.util.List;
import java.util.ArrayList;

public class Service {
	
	private ClienteDao clienteDao;   //dependencia
	private PolizaDAO polizaDAO;
	
	public Service() {
		super();
		polizaDAO = new PolizaDAOImpl();
		this.clienteDao = new ClienteDAOImpl(polizaDAO);
	}
	
	public List<Cliente>getClientes(){
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteDao.consultar();
		return lista;		
	}

}
