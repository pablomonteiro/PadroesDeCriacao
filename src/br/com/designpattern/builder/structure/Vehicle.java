package br.com.designpattern.builder.structure;

public class Vehicle {

	private String marca;
	private String modelo;
	
	public Vehicle(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getBrand() { return marca;}
	
	public String getModel() { return modelo;}
}
