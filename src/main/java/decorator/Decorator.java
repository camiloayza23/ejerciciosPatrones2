package decorator;

public abstract class Decorator implements Cuenta{
    private Cuenta componente;

    public Decorator(Cuenta componente){
        this.componente = componente;
    }

    public void funcion(){
        componente.funcion();
    }
}