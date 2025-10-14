package week3.day2;

public class InheitanceAutomobile {
	
	public void horn() {
		System.out.println("Horn method invoked successfully");

	}
	
	public void clutch() {
		System.out.println("Clutch method invoked successfully");

	}
	
	public void stearing() {
		System.out.println("Stearing method invoked successfully");

	}

	public static void main(String[] args) {
		
	InheitanceAutomobile auto = new InheitanceAutomobile();
	
	auto.horn();
	auto.clutch();
	auto.stearing();

	}

}
