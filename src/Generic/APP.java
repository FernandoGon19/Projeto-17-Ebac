package Generic;

public class APP {

	public static void main(String[] args) {
		CarList<Car> carList = new CarList<>();
		Agile Car1 = new Agile("Agile Carro");
		Corsa Car2 = new Corsa("Corsa");
		Astra Car3 = new Astra("Astra");
		
		carList.addCar(Car1);
		carList.addCar(Car2);
		carList.addCar(Car3);
				
		carList.printCars();
	}
}
