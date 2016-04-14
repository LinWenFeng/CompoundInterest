package DBase;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {

	public static void main(String[] args) {
	ConnectionFactory connectionFactory=ConnectionFactory.getInstane();
	Connection connection=connectionFactory.makeConnection();
	try {
		System.out.println(connection.getAutoCommit());
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	}

}
