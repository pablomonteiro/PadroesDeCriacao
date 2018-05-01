package br.com.designpattern.builder;

import br.com.designpattern.builder.structure.Car;
import br.com.designpattern.builder.structure.CarBuilder;
import br.com.designpattern.builder.structure.Truck;
import br.com.designpattern.builder.structure.TruckBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		Car fiatUno = new CarBuilder("Fiat", "Uno")
							.withArCondicionado()
							.withBancoDeCouro()
							.build();
		System.out.println(fiatUno);
		Car fordKa = new CarBuilder("Ford", "Ka")
							.withAirBag()
							.withArCondicionado()
							.withVidroEletrico()
							.build();
		System.out.println(fordKa);
		
		Truck mercedes1113 = new TruckBuilder("Mercedes", "1113")
							.withDieselEngine()
							.build();
		System.out.println(mercedes1113);

		Truck scaniaP310 = new TruckBuilder("Scania", "p310")
							.withDieselEngine()
							.withTrailer()
							.build();
		System.out.println(scaniaP310);
	}
	
}
