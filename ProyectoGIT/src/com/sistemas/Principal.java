package com.sistemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static String nom;
	static String apell;
	static String correo;
	static int edad;
	static Scanner datos = new Scanner(System.in);
	static AgregarCliente ac = new AgregarCliente();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ingresarNElementos();
		listar();
		System.out.print("Jonas");	
	}
public static void ingresarNElementos(){
		int cant=0;
		System.out.print("Ingresar N° de Clientes:\n");
		cant = datos.nextInt();
		ingresar(cant);
}
	
public static void ingresar(int a){
	Cliente cliente;
	String nom, apell, correo;
	for(int i=0;i<a;i++){
		System.out.print("Ingresar Cliente 0"+(i+1)+"\n");		
		nom = datos.next();
		apell = datos.next();
		edad = datos.nextInt();
		correo = datos.next();			
		cliente = new Cliente(nom,apell,edad,correo);	
		ac.agregar(cliente);
	}
}
public static void listar(){
	ArrayList<Cliente> lista = null;
	lista = ac.getLista();
	System.out.println("Listado de Clientes <"+ac.mostrarLista()+">");
	System.out.println("----------------------------------");
	System.out.println("Nº\tNombres\t\tApellidos\tEdad\tCorreo");
	System.out.print("\n");
	for(int i=0;i<lista.size();i++){
	System.out.println((i+1)+".- \t"+lista.get(i).getNombre()+"\t\t"+lista.get(i).getApell()+"\t\t"+lista.get(i).getEdad()+"\t"+lista.get(i).getCorreo());
	}
}

}
