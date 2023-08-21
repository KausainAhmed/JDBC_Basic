package ahmed.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountDao {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "open6162");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from student");) {

			// System.out.println(con);
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			int update = st.executeUpdate("update student set Age=12 where Name='Raza' ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
