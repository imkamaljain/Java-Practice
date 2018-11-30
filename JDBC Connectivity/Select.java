package JDBC;
import java.sql.*;
public class Select {
public static void main(String arg[])
{
	try
	{
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:kj/kj@localhost");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("create table java(id number,name varchar2(50),marks number)");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}