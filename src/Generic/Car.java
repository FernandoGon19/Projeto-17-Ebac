package Generic;

public abstract class Car {

	private String carro;

	public Car(String carro) {
		super();
		this.carro = carro;
	}

	public String getCarro() {
		return carro;
	}
	
	public abstract void start();
	
}
