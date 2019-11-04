package decorator;

public class BancaPorInternet extends Decorator{

	private int monto;
    private Boolean enable;

    public BancaPorInternet(Cuenta componente){
        super(componente);
        monto = componente.getMonto();
    }

    public void funcion(){
        super.funcion();
        this.enable = true;
        System.out.println("El estado del seguro es: " + this.enable);
    }

	@Override
	public int getMonto() {
		return monto;
	}
}
