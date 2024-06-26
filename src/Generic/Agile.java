package Generic;

public class Agile extends Car {

	public  Agile (String carro) {
		super(carro);
	}

	@Override
	public void start() {
		System.out.println("O carro é um Agile");
	}
}
