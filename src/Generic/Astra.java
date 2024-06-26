package Generic;

public class Astra extends Car {

	public  Astra (String carro) {
		super(carro);
	}

	@Override
	public void start() {
		System.out.println("O carro é um Astra");
	}
}
