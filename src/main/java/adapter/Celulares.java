package adapter;

public class Celulares implements IEmpresa1{
	
	private int precio;
	private int tiempoVida = 3;
	
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
