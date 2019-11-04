package proxy;

public class Server implements IServer {

	Request request;
	
	
	public Server(Request request) {
		this.request = request;
	}


	@Override
	public void request() {
		System.out.println("El usuario pidio una " + this.request.getPeticion() + " del archivo " + this.request.getNombre() + this.request.getExtension());
	}

}
