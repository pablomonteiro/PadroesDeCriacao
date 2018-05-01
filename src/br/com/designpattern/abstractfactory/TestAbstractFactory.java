package br.com.designpattern.abstractfactory;

import br.com.designpattern.abstractfactory.structure.AppConnectorFactory;
import br.com.designpattern.abstractfactory.structure.AppType;
import br.com.designpattern.abstractfactory.structure.Connector;

public class TestAbstractFactory {

	public static void main(String[] args) {
		Connector connector = AppConnectorFactory.createConcreteConnector(AppType.DESKTOP).createConnector();
		connector.connect();
	}
	
}
