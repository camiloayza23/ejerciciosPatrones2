package adapter;

public class Tablets implements IEmpresa1{
	
	private int precio;
	private int tiempoVida = 5;
	
	@Override
	public int getTiempoVida() {
		return tiempoVida;
	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int getPrecio() {
		return precio;
	}

}
