package com.sistemas;

import java.util.ArrayList;

public class AgregarCliente {
ArrayList<Cliente> lista;
public AgregarCliente(){
	this.lista = new ArrayList<Cliente>();
}
public void agregar(Cliente c){
	lista.add(c);	
}

public int mostrarLista() {
	return lista.size();
}
public ArrayList<Cliente> getLista(){
	return this.lista;
}
}
