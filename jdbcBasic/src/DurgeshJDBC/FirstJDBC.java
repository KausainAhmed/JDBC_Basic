package DurgeshJDBC;
import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","open6162");
		
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		}else {
			System.out.println("Connection Created");}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
