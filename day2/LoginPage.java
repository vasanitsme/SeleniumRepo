package week3.day2;

public class LoginPage extends BasePage {
	
	 public void performCommonTasks() {
		 
			System.out.println("performCommonTasks method is now overrided and invoked sucessfuly from class: LoginPage");
			super.performCommonTasks();

		}
	
	
	
	public static void main(String[] args) {
		
		LoginPage loginpage = new LoginPage();
		loginpage.performCommonTasks();
		BasePage basepage = new BasePage();
		basepage.performCommonTasks();
		
		
		
		
		
	}
}
