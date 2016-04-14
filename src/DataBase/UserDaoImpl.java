package DataBase;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection connection, User user) throws SQLException {
		PreparedStatement pStatement=(PreparedStatement) connection.
				prepareCall("INSERT INTO user(name,password)VALUES(?,?)");
		//INSERT INTO user(id,name,password,email)
		pStatement.setString(1, user.getName());
		pStatement.setString(2, user.getPassword());
		pStatement.execute();
		System.out.println("²Ù×÷³É¹¦");
	}

	@Override
	public void update(Connection connection, Long id, User user)
			throws SQLException {
		String updateSql="UPDATE user SET name=?,password=?,emil=? WHERE id= ?";
		PreparedStatement pStatement= (PreparedStatement) connection.prepareCall(updateSql);
		pStatement.setString(1, user.getName());
		pStatement.setString(2, user.getPassword());
		pStatement.setString(3, user.getEmail());
		pStatement.setLong(4, id);
		pStatement.execute();
	}

	@Override
	public void delete(Connection connection, User user) throws SQLException {
		PreparedStatement pStatement=(PreparedStatement) connection
				.prepareCall("DELET FROM user2 WHERE id=?");
		pStatement.setLong(1, user.getId());
		pStatement.execute();
	}

}
