package proxy;

public class Client {
	enum Peticion {Descarga, Carga};
	
	public static void main(String[] args) {
		IServer proxy = new Proxy(new Request("Ejercicios", ".zip", Peticion.Carga));
		IServer proxy2 = new Proxy(new Request("Documentos", ".rar", Peticion.Descarga));
		IServer proxy3 = new Proxy(new Request("Informe", ".doc", Peticion.Carga));
		
		proxy.request();
		proxy2.request();
		proxy3.request();
		
	}
}
