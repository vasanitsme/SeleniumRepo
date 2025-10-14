package week3.day2;

public class APIClient {

	private void sendRequest(String endpoint) {
		System.out.println("Sendrequest method invoked successfully in class : APIClient; with endpoint: " + endpoint);
	}

	private void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Sendrequest invoked from APIClient class ; " + " " + endpoint + " " + requestBody + " "
				+ requestStatus);
	}

	public static void main(String[] args) {

		APIClient apiclient = new APIClient();

		apiclient.sendRequest("endpoint");
		apiclient.sendRequest("endpoint", "request body", false);

	}

}
