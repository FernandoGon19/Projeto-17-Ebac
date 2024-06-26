package Generic;

public class Corsa extends Car {

	public Corsa  (String carro) {
		super(carro);
	}

	@Override
	public void start() {
		System.out.println("O carro é um Corsa");
	}
}
