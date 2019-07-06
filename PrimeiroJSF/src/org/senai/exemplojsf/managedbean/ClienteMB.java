package org.senai.exemplojsf.managedbean;

import javax.faces.bean.ManagedBean;

import org.senai.exemplojsf.modelos.Cliente;
@ManagedBean
public class ClienteMB {
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void gravar() {
		
	}
}
