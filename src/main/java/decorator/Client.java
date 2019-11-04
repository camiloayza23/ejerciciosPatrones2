package decorator;

public class Client {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaBancoClasica(100,"Ana");
        cuenta = new BancaPorInternet(cuenta);
        cuenta = new SeguroCuenta(cuenta);
        cuenta = new Promocion(cuenta);

        cuenta.funcion();
    }
}
