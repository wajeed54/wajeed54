import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ksv","root","root");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into employees values(104,'SriValli')");
			System.out.println(i+"New Recored Inserted.......");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	}


