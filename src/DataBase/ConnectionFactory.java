package DataBase;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectionFactory FACTORY=new ConnectionFactory();
	private Connection connection;
	static {
		Properties properties=new Properties();
		try {
			InputStream inStream=ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");
			properties.load(inStream);
			
		} catch (Exception e) {
			
		}
		driver=properties.getProperty("driver");
		dburl=properties.getProperty("dburl");
		user=properties.getProperty("user");
		password=properties.getProperty("password");
	}
	private ConnectionFactory(){
		
	}
	public static ConnectionFactory getInstane() {
		return FACTORY;
		
	}
	public Connection makeConnection() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(dburl,user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
