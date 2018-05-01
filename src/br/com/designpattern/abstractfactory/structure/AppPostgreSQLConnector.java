package br.com.designpattern.abstractfactory.structure;

public class AppPostgreSQLConnector extends AppConnectorFactory {

	@Override
	public Connector createConnector() {
		return new PostgreSQLConnector();
	}

}
