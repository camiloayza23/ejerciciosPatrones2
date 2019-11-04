package bridge;

public class Credito implements ICuentas {

	private IMoneda moneda;
	private int monto;
	
	public Credito (IMoneda moneda) {
		this.moneda=moneda;
		this.monto = 200;
	}
	@Override
	public void crear() {
		System.out.println("Iniciando cuenta de credito..");
		double cambio = moneda.defMoneda(monto);
		System.out.println("No se aplican intereses, el monto total es: " + cambio + "Bs");
	}

}

