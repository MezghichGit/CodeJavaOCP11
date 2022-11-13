package day6.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn;
		Driver drive;
		
		//Class.forName("com.mysql.jdbc.Driver");
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp11","root","");
		System.out.println(conn);
		
		//Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//Statement stmt = conn.createStatement();
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		//String req = "insert into etudiant(nom, moy) values('mr y','8.5')";
		/*
		String req = "delete from etudiant where id='1'";
		int nb = stmt.executeUpdate(req);
		System.out.println("nb = "+nb);*/
		String req = "select * from etudiant";// where id='10'";
		ResultSet rs = stmt.executeQuery(req);
		 //rs.afterLast();
		rs.absolute(-2);
		// System.out.println(rs.previous()); // true
		 System.out.println(rs.getInt(1)); // 2 

		/*
		while(rs.next())
		{
		//if(rs.next()) {
			int id = rs.getInt(1);//rs.getInt("id");
			String nom = rs.getString(2); //rs.getString("nom");
			double moy = rs.getDouble(3); //rs.getDouble("moy");
			System.out.println(id+" "+nom+" "+moy);
		//}*/
		//}

	}

}
