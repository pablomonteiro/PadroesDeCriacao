package br.com.designpattern.builder.structure;

public class TruckBuilder {

	private Truck truck;
	
	public TruckBuilder(String model, String brand) {
		this.truck = new Truck(model, brand);
	}
	
	public TruckBuilder withDieselEngine() {
		this.truck.addExtra("Motor a Diesel");
		return this;
	}
	
	public TruckBuilder withTrailer() {
		this.truck.addExtra("Com cavalinho");
		return this;
	}
	
	public Truck build() {
		return this.truck;
	}
	
}
