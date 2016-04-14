package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionTest {

	public static void main(String[] args) {
		insertUserData();
		//insertAddressData();
	}
	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root", "123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	public static void insertUserData() {
		Connection connection=getConnection();
		try {
			String sql="INSERT INTO user(id,name,password,email)"
					+"VALUES (12,'Tomg','123456','tom@gmail.com')";
			Statement statement=connection.createStatement();
			int count =statement.executeUpdate(sql);
			System.out.println("���û��������"+count+"����¼");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ�ܣ�");
		}
	}
	public static void insertAddressData() {
		Connection connection=getConnection();
		try {
			String sql="INSERT INTO address(id,city,country,user_id)"+
		"VALUES (1,'shanghai','china','10')";
			Statement statement=connection.createStatement();
			int count=statement.executeUpdate(sql);
			System.out.println("���û���ַ�����"+count+"����¼");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
