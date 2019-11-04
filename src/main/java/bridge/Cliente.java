package bridge;

public class Cliente {
	public static void main(String[] args) {
		Dolares dolares = new Dolares();
		Bolivianos bolivianos = new Bolivianos();
		Euros euros = new Euros();
		
		Credito cred = new Credito(dolares);
		cred.crear();
		
		Ahorro aho = new Ahorro(bolivianos);
		aho.crear();
		
		PlazoFijo pf = new PlazoFijo(euros);
		pf.crear();
	}
}
