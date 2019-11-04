package proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Server2 implements IServer {

	Request request;
	
	
	public Server2(Request request) {
		this.request = request;
	}


	@Override
	public void request() {
		LocalDateTime now = LocalDateTime.now();  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		String formatDateTime = now.format(format);
		System.out.println("Se hizo un backup de la solicitud del archivo " + this.request.getNombre() + this.request.getExtension() +" a las " + formatDateTime);
	}

}
