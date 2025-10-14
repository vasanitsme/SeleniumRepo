package week3.day2;

public class InheritToyata extends InheritCar {

	public void carName() {

		System.out.println("Car Name is: Fortuner");

	}

	public void logo() {

		System.out.println("Logo is: T");

	}

	public static void main(String[] args) {

		InheritToyata mycar = new InheritToyata();
		mycar.clutch();
		mycar.stearing();
		mycar.horn();
		mycar.designCar();
		mycar.carName();
		mycar.logo();

	}

}
