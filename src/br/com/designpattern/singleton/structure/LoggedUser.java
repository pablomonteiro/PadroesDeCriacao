package br.com.designpattern.singleton.structure;

public class LoggedUser {
	
	private User user = new User();
	private static LoggedUser instance;	
	
	private LoggedUser() {}

	public static synchronized LoggedUser getInstance() {
	    if (instance == null) {
	    		instance = new LoggedUser();
	    		System.out.println("Criando nova instância");
	    }
	    System.out.println("Retorna instância existente");
	    return instance;
	}
	
	public void setUser(String newUserLogin) {
		user.setLogin(newUserLogin);
	}
	
	public void printLoggedUser() {
		System.out.println(user.getLogin());
	}
	
}
