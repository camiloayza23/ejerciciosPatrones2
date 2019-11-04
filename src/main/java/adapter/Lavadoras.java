package adapter;

public class Lavadoras implements IEmpresa2 {
	
	private int costo;
	private int garantia = 10;
	
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
