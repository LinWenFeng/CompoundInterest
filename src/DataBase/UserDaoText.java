package DataBase;

import java.sql.Connection;

public class UserDaoText {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection=ConnectionFactory.getInstane().makeConnection();
			connection.setAutoCommit(false);
			UserDao userDao=new UserDaoImpl();
			User tom=new User();
			tom.setName("lw");
			tom.setPassword("123456");
			tom.setEmail("tom@gmail");
			userDao.save(connection, tom);
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
