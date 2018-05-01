package br.com.designpattern.abstractfactory.structure;

public class AppSQLServerConnector extends AppConnectorFactory {

	@Override
	public Connector createConnector() {
		return new SQLServerConnector();
	}

}
