package week3.day3;

public abstract class MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect method invoked from class: JavaConnection");

	}

	@Override
	public void disconnect() {
		System.out.println("disconnect method invoked from class: JavaConnection");

	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate method invoked from class: JavaConnection");
	}

	public void executeQuery() {
		System.out.println("executeQuery method invoked from class: MySqlConnection");

	}
}
