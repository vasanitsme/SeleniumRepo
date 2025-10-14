package week3.day2;

public class LoginTestData extends TestData {

	public void enterUsername() {

		System.out.println("enterUsername method invoked sucessfuly from class: LoginTestData");

	}

	public void enterPassword() {

		System.out.println("enterPassword method invoked sucessfuly from class: LoginTestData");

	}

	public static void main(String[] args) {

		LoginTestData logintestdata = new LoginTestData();
		logintestdata.enterUsername();
		logintestdata.enterPassword();
		logintestdata.enterCredentials();
		logintestdata.navigateToHomePage();
		
		TestData testdata = new TestData();
		testdata.enterCredentials();
		testdata.navigateToHomePage();

	}

}
