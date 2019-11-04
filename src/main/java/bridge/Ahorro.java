package bridge;

public class Ahorro implements ICuentas {

	private IMoneda moneda;
	private int monto; 
	
	public Ahorro (IMoneda moneda) {
		this.moneda=moneda;
		this.monto = 100;
	}
	@Override
	public void crear() {
		System.out.println("Iniciando cuenta de ahorros..");
		int cambio = moneda.defMoneda(monto);
		double intereses = cambio * 0.2;
		System.out.println("Se aplica un interes del 2%, el monto es: " + (cambio+intereses) + "Bs.");
	}

}
