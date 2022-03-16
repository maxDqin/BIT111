package week10;

import java.sql.*;

public class DatabaseTest {
	public static void main(String args[]) {
		try {
			//connection making
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:./enrolmentSystem.db");
			
			// statement
//			Statement state = con.createStatement();
//			ResultSet res = state.executeQuery("select * from enrolment where sid='1000'");
			
			PreparedStatement pt = con.prepareStatement("select * from enrolment where sid=?");
			pt.setString(1, "1000");
			ResultSet res = pt.executeQuery();
//			
			// execute statement
			while (res.next()) {
				System.out.println(res.getString(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(8));
				
				System.out.println("========");
			}
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
