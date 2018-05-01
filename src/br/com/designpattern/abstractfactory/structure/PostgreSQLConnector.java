package br.com.designpattern.abstractfactory.structure;

public class PostgreSQLConnector implements Connector {

	@Override
	public void connect() {
		// Implementação necessária para conectar-se 
		// ao banco de dados postgreSQL.
		System.out.println("CRIANDO CONEXÃO COM O BANCO POSTGRESQL.");
	}

}
