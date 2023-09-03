package in.workspace.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCUpdateData {
	
	public static void main(String[] args) throws SQLException {	
		
        //Step-2 :- Establish the connection

		String url = "jdbc:mysql:///ineuron";
		String username = "root";
		String password = "Anandh@123";
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("Connection object created...");
		
        //Step-3 :- Create statement object and send the query
				    
		Statement statement = connection.createStatement();
		System.out.println("Statement object is created...");
		
		String sqlUpdateQuery = "update student set sname = 'VinayKumar' where sid =2";
		
		int rowAffected = statement.executeUpdate(sqlUpdateQuery);
		
		System.out.println("No of rows updated is :: " + rowAffected);
		
        //Closing the resources

		statement.close();
		connection.close();
		System.out.println("Closing the resources...");
	}

}
