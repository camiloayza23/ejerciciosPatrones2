package composite;

import java.util.ArrayList;

public class Composite extends Component {
	
    private ArrayList<Component> list = new ArrayList<>();
    private int acumulado;
    private static int acumuladoCom = 100;
    
    
    public static int getAcumuladoCom() {
		return acumuladoCom;
	}

	public static void setAcumuladoCom(int acumuladoCom) {
		Composite.acumuladoCom = acumuladoCom;
	}

	public int getAcumulado() {
		return acumulado;
	}

	public Composite(){
        super();
    }

    @Override
    public void estimacion() {
    		for (Component comp: list) {
    			comp.receiver(acumulado, acumuladoCom);
    			comp.estimacion();
    			acumulado = comp.getEst();
    			acumuladoCom += 100;
    		}
    		acumuladoCom -= 100;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getValor());
    }

}