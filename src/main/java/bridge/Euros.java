package bridge;

public class Euros implements IMoneda{
	
	@Override
	public int defMoneda(int monto) {
		System.out.println("Cambiando euros a bolivianos...");
		return monto*8;
	}

}
