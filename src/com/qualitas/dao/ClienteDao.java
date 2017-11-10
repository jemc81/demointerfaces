package com.qualitas.dao;

import java.util.List;

import com.qualitas.entities.Cliente;
import com.qualitas.entities.Poliza;

public interface ClienteDao {
	
	public int insertar (Cliente cliente);
	
	public int borrar (Cliente cliente);
	
	public int actualizar (Cliente cliente);
	
	public int consultar (String nombre, String direccion, Poliza poliza);
	
	public List<Cliente> consultar();
	
	public List<Cliente> consultar(int inicio, int fin);

}
