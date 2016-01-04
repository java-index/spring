package biz.ecology.spring.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlainContactDao implements ContactDao {

	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://192.168.0.100:3306/test", "ecology", "*159654eco");
	}

	private void closeConnection(Connection connection) {
		if (connection == null) return;
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Contact> findAll() {
		List<Contact> contacts = new ArrayList<Contact>();
		Connection connection = null;


		return null;
	}

	public List<Contact> findByFirstName(String firstName) {
		return null;
	}

	public String findLastNameById(Long id) {
		return null;
	}

	public String findFirstNameById(Long id) {
		return null;
	}

	public void insert(Contact contact) {

	}

	public void update(Contact contact) {

	}

	public void delete(Long contactId) {

	}
}
