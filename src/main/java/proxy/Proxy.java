package proxy;

public class Proxy implements IServer{

	private Request request;
	private Server serverReal = null;
	private Server2 serverBackup = null;
		
	public Proxy(Request request) {
		this.request = request;
	}

	@Override
	public void request() {
		if(serverReal == null)
			serverReal = new Server(request);
		if(serverBackup == null)
			serverBackup = new Server2(request);
		if (request.getExtension().equals(".zip") ||  request.getExtension().equals(".rar")) {
			this.serverReal.request();
			this.serverBackup.request();
		} else {
			System.out.println("Extension invalida");
		}
		
	}
	
}
