package adapter;

public class Client {
	
	public static void main(String []args) {

		// Empresa 1
		Computadoras comp = new Computadoras();
		Tablets tablet = new Tablets();
		Celulares cel = new Celulares();
		
		comp.setPrecio(600);
		tablet.setPrecio(100);
		cel.setPrecio(400);
		
		// Empresa 2
		Refrigeradores refri = new Refrigeradores();
		Lavadoras lava = new Lavadoras();
		Televisores tele = new Televisores();
		
		refri.setCosto(700);
		lava.setCosto(650);
		tele.setCosto(300);
		
		AdaptadorTele adapTele = new AdaptadorTele(tele);
		AdaptadorRefri adapRefri = new AdaptadorRefri(refri);
		AdaptadorLava adapLava = new AdaptadorLava(lava);
		
		System.out.println("La computadora tiene un precio de: " + comp.getPrecio() + "$");
		System.out.println("La tablet tiene un precio de: " + tablet.getPrecio()+ "$");
		System.out.println("El celular tiene un precio de: " + cel.getPrecio()+ "$");
		System.out.println("El televisor tiene un precio de: " + adapTele.getPrecio()+ "$");
		System.out.println("El refrigerador tiene un precio de: " +adapRefri.getPrecio()+ "$");
		System.out.println("La lavadora tiene un precio de: " +adapLava.getPrecio()+ "$");

	}

}
