import java.io.*;
import java.sql.*;  
class MysqlCon
{  
	public static void main(String args[])
	{  
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mag?useSSL=false&serverTimezone=UTC","root","Bunny@02");  
			//here db is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from stud");  
			while(rs.next())  
			System.out.println(rs.getInt(1));
			con.close();  
		}
		catch(Exception e){ System.out.println(e);}  
}  
}