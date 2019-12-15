package com.locosporjava.funtion;

public class Articulo {
	private String nombre;
	private float precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Articulo() {

	}
	public Articulo(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	

}
