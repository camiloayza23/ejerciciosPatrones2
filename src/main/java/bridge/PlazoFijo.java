package bridge;

public class PlazoFijo implements ICuentas {

	private IMoneda moneda;
	private int monto;
	
	public PlazoFijo (IMoneda moneda) {
		this.moneda=moneda;
		this.monto = 300;
	}
	@Override
	public void crear() {
		System.out.println("Iniciando cuenta de plazo fijo..");
		int cambio = moneda.defMoneda(monto);
		double intereses = cambio * 0.5;
		System.out.println("Se aplica un interes del 5%, el monto es: " + (cambio+intereses) + "Bs.");
	}

}
