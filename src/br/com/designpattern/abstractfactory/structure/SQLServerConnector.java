package br.com.designpattern.abstractfactory.structure;

public class SQLServerConnector implements Connector {

	@Override
	public void connect() {
		// Implementação necessária para conectar-se 
		// ao banco de dados sqlServer.
		System.out.println("CRIANDO CONEXÃO COM O BANCO SQL SERVER.");
	}

}
