package test;
import java.sql.*;
public class employee {
	public static void main(String[] args)
	{
		try 
	{
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","c##sidhartha","tapan");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from TABLE_CUST");
		while(rs.next())
		{
		    System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		con.close();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
