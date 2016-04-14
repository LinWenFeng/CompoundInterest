package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingUpConnect {
	private Connection connection;
	private Statement statement;
	ResultSet resultSet;
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SingUpConnect() {
		connection=ConnectionFactory.getInstane().makeConnection();
	}
	public void Sin_In() {
		ResultSet resultSet=null;
		String sql="SELECT * FROM user";
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				name=resultSet.getString("name");
				password=resultSet.getString("password");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getString("username"));
				System.out.println(resultSet.getString("password"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			try {
				resultSet.close();
			} catch (Exception e2) {
				
			}
			try {
				statement.close();
			} catch (Exception e2) {
				
			}
			try {
				connection.close();
			} catch (Exception e2) {
			
			}
		}
		
	}
	public void SinUp(String name,String password){
		try {
			connection.setAutoCommit(false);
			UserDao userDao=new UserDaoImpl();
			User user=new User();
			user.setName(name);
			user.setPassword(password);
			userDao.save(connection, user);
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
