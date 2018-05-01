package br.com.designpattern.singleton;

import br.com.designpattern.singleton.structure.LoggedUser;

public class TestSingleton {
	public static void main(String[] args) {
		LoggedUser instance_1 = LoggedUser.getInstance();
		instance_1.setUser("João");
		instance_1.printLoggedUser();
		LoggedUser instance_2 = LoggedUser.getInstance();
		instance_2.setUser("Maria");
		instance_2.printLoggedUser();
	}
}
