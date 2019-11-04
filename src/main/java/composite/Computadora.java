package composite;

public class Computadora extends Component {
	
	private int suma;
	private int contenedor;
	private int helper;

	public Computadora(int laboratorio){
        super();
        this.contenedor = laboratorio;
    }
	
	public void receiver(int acumulado, int acumuladoGen) {
		suma = acumulado;
		helper = acumuladoGen;
	}
	
    public int getContenedor() {
		return contenedor;
	}

	@Override
    public void estimacion() {
    	suma += getValor();
    	setEst(suma);
    	if (this.getContenedor() == 1) {
    		System.out.println("Contenedor 1: " + helper);
		}
    }


    @Override
    public void add(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Leaf :"+this.getValor());
    }


}
