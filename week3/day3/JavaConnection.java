package week3.day3;

public class JavaConnection extends MySqlConnection {
	
	
	public static void main(String[] args) {
		
		JavaConnection connection  = new JavaConnection();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
		connection.executeQuery();
		
	}
	
	

}
