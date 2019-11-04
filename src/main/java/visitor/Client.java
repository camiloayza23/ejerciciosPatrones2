package visitor;

import java.util.concurrent.TimeUnit;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		Gato gato = new Gato();
		Perro perro = new Perro();
		Caballo caballo = new Caballo();
		
		gato.setEnfermedad1("moquillo");
		perro.setEnfermedad2("una herida");
		
		
		Veterinario visitor = new Veterinario();
		
		System.out.println(gato.accept(visitor));
		TimeUnit.SECONDS.sleep(1);
		System.out.println(perro.accept(visitor));
		System.out.println(caballo.accept(visitor));
	}
}
