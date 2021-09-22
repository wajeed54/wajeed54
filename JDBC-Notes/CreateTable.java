import java.sql.*;
public class CreateTable {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ksv","root","root");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("create table employees1(id int(30),name varchar(40))");
			System.out.println(i+"New Table has been created.......");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
