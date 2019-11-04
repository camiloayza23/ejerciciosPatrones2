package adapter;

public class Refrigeradores implements IEmpresa2 {
	
	private int costo;
	private int garantia = 15;
	
	@Override
	public int getGarantia() {
		return garantia;
	}

	@Override
	public void setCosto(int precio) {
		this.costo = precio;
	}

	@Override
	public int getCosto() {
		return costo;
	}

}
