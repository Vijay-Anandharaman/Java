package in.workspace.main;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DynamicJDBCInputInsertData
{
	
	public static void main(String[] args) throws SQLException
    {	
		//Step-2 :- Establish the connection

		String url = "jdbc:mysql:///ineuron";
		String username = "root";
		String password = "Anandh@123";
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("Connection object created...");

        //Step-3 :- Create statement object and send the query
	    
		Statement statement = connection.createStatement();
		System.out.println("Statement object is created...");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the student :: ");
		String sname = scanner.next();
		
		System.out.println("Enter the age of the student :: ");
		int sage = scanner.nextInt();
		
		System.out.println("Enter the address of the student :: ");
		String saddress = scanner.next();
		
		String sqlInsertQuery = String.format("INSERT INTO student (sname, sage, saddress) VALUES ('%s',%d,'%s')", sname, sage, saddress);
		
		int rowAffected = statement.executeUpdate(sqlInsertQuery);
		System.out.println("No of rows affected is :: " + rowAffected);
		
        //Closing the resources
		scanner.close();
		statement.close();
		connection.close();
		System.out.println("Closing the resources");
	}

}
