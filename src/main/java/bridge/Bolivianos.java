package bridge;

public class Bolivianos implements IMoneda{
	
	@Override
	public int defMoneda(int monto) {
		System.out.println("No se necesita convertir a bolivianos");
		return monto;
	}

}
