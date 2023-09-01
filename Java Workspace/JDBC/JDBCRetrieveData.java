package in.workspace.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class JDBCRetrieveData
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
		//TODO Auto-generated method stub
				
				Connection connection = null;
				Statement statement = null;
				ResultSet resultSet = null;
						
				try
				{					
					//Step-1 :- Load and register the Driver
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Driver loaded successfully...");
					
					//Step-2 :- Establish the connection
					
					String url = "jdbc:mysql://localhost:3306/ineuron";
					String username = "root";
					String password = "Anandh@123";
					connection = DriverManager.getConnection(url,username,password);
				    System.out.println("Connection established successfully...");
				    System.out.println("The implementation class name is :: " + connection.getClass().getName());
				    
				    //Step-3 :- Create statement object and send the query
				    
				    String sqlSelectQuery = "select sid, sname, sage, saddress from student";
				    statement = connection.createStatement();
				    System.out.println("The implementation class name is :: " + statement.getClass().getName());
				    resultSet  = statement.executeQuery(sqlSelectQuery);
				    System.out.println("The implementation class name is :: " + resultSet.getClass().getName());
				    System.out.println();
				    System.out.println("SID\tSANME\tSAGE\tSADDRESS");

				    //Step-4 :- Process the result set
				    
				    while(resultSet.next())
				    {
				    	Integer sid  = resultSet.getInt(1);
				    	String sname = resultSet.getString(2);
				    	Integer sage  = resultSet.getInt(3);
				    	String saddress = resultSet.getString(4);
				    	System.out.println();
				    	System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + saddress );
				    }
				}
						
				catch(ClassNotFoundException ce)
				{
					ce.printStackTrace();
				}
				catch(SQLException se)
				{
					
				}
				catch(Exception e)
				{
					
				}
				finally
				{
					//Closing the resources
					if(connection!=null)
					{
						try
						{
							connection.close();
							System.out.println();
							System.out.println("Connection is closed...");
						}
						catch(SQLException se)
						{
							
						}
					}
				}	
    }
}
