package adapter;

public class AdaptadorLava implements IEmpresa1{
	
	private Lavadoras lava = new Lavadoras();
	private int tiempoVida;
	private int precio;
	
	public AdaptadorLava(Lavadoras lava) {
		this.lava = lava;
	}

	@Override
	public int getTiempoVida() {
		tiempoVida = this.lava.getGarantia();
		return tiempoVida;
	}

	@Override
	public void setPrecio(int precio) {
		this.lava.setCosto(precio);
	}

	@Override
	public int getPrecio() {
		precio = this.lava.getCosto();
		return precio;
	}

}

