package br.com.designpattern.abstractfactory.structure;

public class OracleConnector implements Connector {

	@Override
	public void connect() {
		// Implementação necessária para conectar-se 
		// ao banco de dados oracle.
		System.out.println("CRIANDO CONEXÃO COM O BANCO ORACLE.");
	}

}
