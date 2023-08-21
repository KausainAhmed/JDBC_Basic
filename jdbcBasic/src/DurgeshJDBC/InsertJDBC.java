package DurgeshJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","open6162");
		
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		}else {
			System.out.println("Connection Created");}
		
		String q="create table table1(tID int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(200))";
		Statement st = con.createStatement();
		st.executeUpdate(q);
		System.out.println("Table created");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
