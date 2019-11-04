package composite;

abstract class Component {

	private static int valor = 100;
	private int est;    


	public void setEst(int est) {
		this.est = est;
	}
		
	public int getEst() {
		return est;		
	}
	
	public int getValor() {
		return valor;
	}

	public void receiver(int acumulado, int acumuladoGen) {
		
	}
	
	public abstract void estimacion();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);
}
