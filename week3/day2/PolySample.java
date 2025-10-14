package week3.day2;

public class PolySample {
	
	private void printCarDetail(String carName) {
		
		System.out.println("My car name is : " + carName );

	}
	
	private void printCarDetail(String CarBrand, String CarModel, int model) {
		
		System.out.println("My car brand is : " + CarBrand + " My car Model is :" + CarModel + " My car brand is : " + model  );

	}

	public static void main(String[] args) {
		
		PolySample ps = new PolySample();
		ps.printCarDetail("Toyota");
		ps.printCarDetail("Etios");
		ps.printCarDetail("Hyundai", "Creta", 2024);
		

	}

}
