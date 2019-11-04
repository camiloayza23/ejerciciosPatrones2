package composite;

public class Client {
    public static void main(String []args){
        Composite laboratorio = new Composite();
        laboratorio.add(new Computadora(1));
        laboratorio.add(new Computadora(1));
        laboratorio.add(new Computadora(1));
     
        Composite laboratorio2 = new Composite();
        laboratorio2.add(new Computadora(1));
        laboratorio2.add(new Computadora(1));
        laboratorio2.add(new Computadora(1));
        
        Composite contenedor = new Composite();
        
        contenedor.add(laboratorio);
        contenedor.add(laboratorio2);
        
                
        contenedor.estimacion();

    }
}