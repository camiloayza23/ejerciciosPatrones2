package decorator;

public class CuentaBancoClasica implements Cuenta{
	
	private int monto;
	private String nombrePropietario;
	
	
    public CuentaBancoClasica(int monto, String nombrePropietario) {
		this.monto = monto;
		this.nombrePropietario = nombrePropietario;
	}
    
    public int getMonto() {
		return monto;
	}

    public void setMonto(int monto) {
		this.monto = monto;
	}

    public String getNombrePropietario() {
		return nombrePropietario;
	}

    public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

    public void funcion(){
        System.out.println("Cuenta clasica creada a nombre de " + this.getNombrePropietario() + ". Monto inicial de: " + this.getMonto() + "Bs.");
    }
}