package bridge;

public class Dolares implements IMoneda{
	
	@Override
	public int defMoneda(int monto) {
		System.out.println("Cambiando dolares a bolivianos...");
		return monto*7;
	}

}
