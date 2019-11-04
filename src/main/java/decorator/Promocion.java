package decorator;

public class Promocion extends Decorator{

	private int monto;

    public Promocion(Cuenta componente){
        super(componente);
        monto = componente.getMonto();
    }

    public void funcion(){
        super.funcion();
        sorteo();
    }

	private void sorteo() {
		int rnd = (int)(Math.random()*(100+1));
		if (rnd%2==0) {
			monto*=2;
			System.out.println("GANO EL SORTEO! Se duplica el monto en su cuenta a: " + monto + "Bs.");
		} else {
			System.out.println("Suerte la proxima vez! Su cuenta queda con: " + monto + "Bs.");
		}
	}

	@Override
	public int getMonto() {
		return monto;
	}
}
