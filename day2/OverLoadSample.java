package week3.day2;

public class OverLoadSample {
	
	public void reprSteps(String msg, String status) {
		
		System.err.println("printing Message:  " + msg + " Printing Status : " + status);
		
	}
	
	
public void reprSteps(String msg, String status, boolean snap) {
		
		System.err.println("printing Message:  " + msg + " Printing Status : " + status + " Printing snap status : " + snap);
		
	}


	public static void main(String[] args) {
		
		OverLoadSample os = new OverLoadSample();
		os.reprSteps("message", "status");
		os.reprSteps("Srini", "Passes", true);
		
		

	}

}
