package com.sistemas;

public class Cliente {
private String nombre;
private String apell;
private int edad;
private String correo;
public Cliente() {
	super();
}
public Cliente(String nombre, String apell, int edad, String correo) {
	super();
	this.nombre = nombre;
	this.apell = apell;
	this.edad = edad;
	this.correo = correo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApell() {
	return apell;
}
public void setApell(String apell) {
	this.apell = apell;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}

}
