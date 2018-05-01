package br.com.designpattern.abstractfactory.structure;

public abstract class AppConnectorFactory {

	public abstract Connector createConnector();
	
	public static AppConnectorFactory createConcreteConnector(AppType app) {
		
		if(AppType.WEB.equals(app)) {
			return new AppOracleConnector();
		} else if(AppType.MOBILE.equals(app)) {
			return new AppPostgreSQLConnector();
		}
		return new AppSQLServerConnector();
	}
	
}
