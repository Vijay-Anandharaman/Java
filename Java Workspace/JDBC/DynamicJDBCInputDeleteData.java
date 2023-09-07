package in.workspace.main;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicJDBCInputDeleteData
{
	public static void main(String[] args) throws SQLException
    {
		String url = "jdbc:mysql:///ineuron";
		String username = "root";
		String password = "Anandh@123";
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Object Created...");
		
		Statement statement = connection.createStatement();
		System.out.println("Statement Object Created...");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name to delete your records ::");
		String sname = scanner.next();
		
		String sqlDeleteQuery = String.format("Delete from student where sname = ", sname);
		
		int rowAffected = statement.executeUpdate(sqlDeleteQuery);
		System.out.println("No of rows affected is :: " + rowAffected);
		
		scanner.close();
		statement.close();
		connection.close();
		System.out.println("Closing the resources...");
	}
}
