package br.com.designpattern.abstractfactory.structure;

public class AppOracleConnector extends AppConnectorFactory {

	@Override
	public Connector createConnector() {
		return new OracleConnector();
	}

}
