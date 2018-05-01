package br.com.designpattern.builder.structure;

public class CarBuilder {
	
	private Car car;
	
	public CarBuilder(String model, String brand) {
		this.car = new Car(model, brand);
	}

	public CarBuilder withArCondicionado() {
		this.car.addExtra("Ar-Condicionando");
		return this;
	}
	
	public CarBuilder withAirBag() {
		this.car.addExtra("Air Bag");
		return this;
	}
	
	public CarBuilder withVidroEletrico() {
		this.car.addExtra("Vidro Elétrico");
		return this;
	}
	
	public CarBuilder withBancoDeCouro() {
		this.car.addExtra("Banco de Couro");
		return this;
	}
	
	public Car build() {
		return this.car;
	}
	
}
