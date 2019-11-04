package adapter;

public class AdaptadorRefri implements IEmpresa1{
	
	private Refrigeradores refri = new Refrigeradores();
	private int tiempoVida;
	private int precio;
	
	public AdaptadorRefri(Refrigeradores refri) {
		this.refri = refri;
	}

	@Override
	public int getTiempoVida() {
		tiempoVida = this.refri.getGarantia();
		return tiempoVida;
	}

	@Override
	public void setPrecio(int precio) {
		this.refri.setCosto(precio);
	}

	@Override
	public int getPrecio() {
		precio = this.refri.getCosto();
		return precio;
	}

}

