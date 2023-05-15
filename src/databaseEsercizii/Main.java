package databaseEsercizii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
	public static String url = "jdbc:postgresql://localhost:5432/s3-g1-es2?useSSL=false";
	public static String username = "postgres";
	public static String password = "";
	public static Connection conn;

	public static void main(String[] args) {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		LocalDate data = LocalDate.now();
		Student test = new Student("dom", "dAt", "m", data, 5.5, 3.4, 4.4);
		insertStudent(test);
	}

	public static void insertStudent(Student s) {
		String SQLinner = "INSERT INTO school_students( name, lastname, gender, birthdate, avg, min_vote, max_vote)VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement addStudente = conn.prepareStatement(SQLinner);
			addStudente.setString(1, s.getName());
			addStudente.setString(2, s.getLastName());
			addStudente.setString(3, s.getGender());
			addStudente.setString(4, s.getBirthdate());
			addStudente.setDouble(5, s.getAvg());
			addStudente.setDouble(6, s.getMin_vote());
			addStudente.setDouble(7, s.getMax_vote());

			addStudente.execute();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}
}
