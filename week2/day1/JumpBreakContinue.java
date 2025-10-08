package week2.day1;

public class JumpBreakContinue {

	public static void main(String[] args) {
		
		for (int i=0; i<=10;i++) {
			System.out.println("Loop number is : " + i);
			if (i==8)
				break;
			
		}
		
		System.out.println("--------------------------");
		
		
		for (int i=0; i<=10;i++) {
				
			if (i==5)
				continue;
			System.out.println("Loop number is : " + i);
		}

	}

}
