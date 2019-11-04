package adapter;

public class AdaptadorTele implements IEmpresa1{
	
	private Televisores tele = new Televisores();
	private int tiempoVida;
	private int precio;
	
	public AdaptadorTele(Televisores tele) {
		this.tele = tele;
	}

	@Override
	public int getTiempoVida() {
		tiempoVida = this.tele.getGarantia();
		return tiempoVida;
	}

	@Override
	public void setPrecio(int precio) {
		this.tele.setCosto(precio);
	}

	@Override
	public int getPrecio() {
		precio = this.tele.getCosto();
		return precio;
	}

}

