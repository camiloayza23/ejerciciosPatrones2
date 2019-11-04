package decorator;

public class SeguroCuenta extends Decorator{
	
	private Cuenta cuenta;
	private int monto; 
	
    public SeguroCuenta(Cuenta componente){
        super(componente);
        this.cuenta = componente;
        monto = cuenta.getMonto() - 50;
    }

    public void funcion(){
        super.funcion();
        descontarCuenta();
    }

    public void descontarCuenta(){  
        System.out.println("Por el servicio de seguro de la cuenta se descuentan 50Bs, queda con: " + monto + "Bs.");
    }

	@Override
	public int getMonto() {
		return monto;
	}
}