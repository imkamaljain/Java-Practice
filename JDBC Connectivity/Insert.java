package JDBC;
import java.sql.*;
public class Insert {
public static void main(String[] args) {
    try
	{
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:kj/kj@localhost");
		Statement stmt=con.createStatement();
        int id=1423;
        String name="KAMAL";
        int marks=100;
		//int rs=stmt.executeUpdate("insert into java values(102,'ABCD',200)");
        int rs=stmt.executeUpdate("insert into java values('"+id+"','"+name+"','"+marks+"')");
        ResultSet rss=stmt.executeQuery("Select * from java");
		while(rss.next())
		{
			System.out.println(rss.getInt(1)+" "+rss.getString(2)+" "+rss.getInt(3));
		}
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}  
}