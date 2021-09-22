import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.*;
public class InsertDataProcedure {

	public static void main(String[] args) {
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ksv","root","root");
				CallableStatement st=con.prepareCall("{call ksv.setuser(?,?)}");
				Scanner in=new Scanner(System.in);
				System.out.println("Enter user values");
				int p_id=in.nextInt();
				String p_name=in.next();
				st.setInt(1,p_id);
				st.setString(2, p_name);
				int x=st.executeUpdate();
				System.out.println(x+"Query Excuted.............");
				System.out.println(x);
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}


