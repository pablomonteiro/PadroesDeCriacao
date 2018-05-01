package br.com.designpattern.builder.structure;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Vehicle {
	
	private List<String> extras = new ArrayList<>();

	public Truck(String marca, String modelo) {
		super(marca, modelo);
	}
	
	public void addExtra(String extra) {
		extras.add(extra);
	}

	@Override
	public String toString() {
		StringBuilder toString = new StringBuilder();
		toString.append("Brand: ");
		toString.append(super.getBrand());
		toString.append(", ");
		toString.append("Model: ");
		toString.append(super.getModel());
		toString.append(", ");
		toString.append("Extra: ");
		toString.append(String.join(", ", extras));
		return "Truck [" + toString.toString() + "]";
	}

}
