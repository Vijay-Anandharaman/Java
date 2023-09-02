package in.workspace.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCInsertData
{
	public static void main(String[] args) throws SQLException
    {	
		
		//Step-1 :- Establish the connection
		
		String url = "jdbc:mysql:///ineuron";
		String username = "root";
		String password = "Anandh@123";
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("Connection object created...");
		
		
		//Step-2 :- Create statement object and send the query
	    
		Statement statement = connection.createStatement();
		System.out.println("Statement object is created...");

		String sqlInsertQuery = "INSERT INTO student (sname, sage, saddress) VALUES ('Vinoth',25,'TNJ')";
		int rowAffected = statement.executeUpdate(sqlInsertQuery);
		System.out.println("No of rows affected is :: " + rowAffected);
		
		//closing the resources
		
		statement.close();
		connection.close();
		System.out.println("Closing the resources");
	}
}
