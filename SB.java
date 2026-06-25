import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.io.*;
import java.sql.*;  
class SB
{  
	public static void main(String args[]) throws IOException
	{  
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mag?useSSL=false","root","Bunny@02");  
			
			Statement stmt=con.createStatement();  
			
			String sql = "create table bank(accno int not null, name varchar(20), balance double(10,2), primary key (accno))";
			
			stmt.executeUpdate(sql);  
			String query = "INSERT INTO bank (accno, name, balance) VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);            
			    ps.setInt(1, 101);
			    ps.setString(2, "chandru");
			    ps.setDouble(3, 10000.00);
			    ps.addBatch();
			    
			    ps.setInt(1, 102);
			    ps.setString(2, "mouli");
			    ps.setDouble(3, 6000.00);
			    ps.addBatch();
			
			    ps.setInt(1, 103);
			    ps.setString(2, "eswar");
			    ps.setDouble(3, 7000.00);
			    ps.addBatch();
			
			 ps.executeBatch();

			ResultSet rs = stmt.executeQuery("select * from bank");
			System.out.printf("accno" + "\t" + "name" + "\t\t" + "balance" );
			System.out.println();
			while(rs.next())  
			{
			System.out.printf(rs.getInt(1)+ "\t");
			System.out.printf(rs.getString(2) + "\t\t");
			System.out.println(rs.getDouble(3));
			}

			// deposit operations for accno 101
			sql = "update bank set balance = balance + 5000 where accno =101";
			stmt.executeUpdate(sql);
			
			// withdraw operations for accno 102
			sql = "update bank set balance = balance - 3000 where accno =102";
			stmt.executeUpdate(sql);

			sql = "delete from bank where accno = 103";
			stmt.executeUpdate(sql);

			rs = stmt.executeQuery("select * from bank"); 
 			System.out.println();
			System.out.printf("accno" + "\t" + "name" + "\t\t" + "balance" );
			System.out.println();
			while(rs.next())  
			{
			System.out.printf(rs.getInt(1)+ "\t");
			System.out.printf(rs.getString(2) + "\t\t");
			System.out.println(rs.getDouble(3));
			}
			con.close();
		}
		catch(Exception e){ System.out.println(e);}  
}  
}