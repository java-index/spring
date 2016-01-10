package biz.ecology.spring.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlainContactDao implements ContactDao {

	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://85.90.217.96:3306/test", "ecology", "*159654eco");
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
		List<Contact> result = new ArrayList<Contact>();
		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM CONTACT");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Contact contact = new Contact();
				contact.setId(resultSet.getLong("ID"));
				contact.setFirstName(resultSet.getString("FIRST_NAME"));
				contact.setLastName(resultSet.getString("LAST_NAME"));
				contact.setBirthDate(resultSet.getDate("BIRTH_DATE"));
				result.add(contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(connection);
		}
		return result;
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
		Connection connection = null;

		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO CONTACT (FIRST_NAME, LAST_NAME, BIRTH_DATE) VALUES (?, ?, ?)"
					, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, contact.getFirstName());
			statement.setString(2, contact.getLastName());
			statement.setDate(3, contact.getBirthDate());
			statement.execute();

			ResultSet generatedKeys = statement.getGeneratedKeys();
			if (generatedKeys.next()) {
				contact.setId(generatedKeys.getLong(1));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}

	}

	public void update(Contact contact) {

	}

	public void delete(Long contactId) {

	}
}
