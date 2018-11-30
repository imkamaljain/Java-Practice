package JDBC;
import java.sql.*;
public class Update {
public static void main(String[] args) 
{
    try
	{
		//Class.forName("com.mysql.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:kj/kj@localhost");
		Statement stmt=con.createStatement();
		int rs=stmt.executeUpdate("update java set name='Jivtesh',marks=100 where id=1002");
		ResultSet rss=stmt.executeQuery("Select * from java");
		while(rss.next())
		{
		    System.out.println(rss.getInt(1)+" "+rss.getString(2)+" "+rss.getString(3));
		}
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}  
}
}
