package JSQ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnect {
	String sql="SELECT * FROM tbl_user";
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	String url = "jdbc:mysql://localhost:3306/test" ;    
    String sqlname = "root" ;   
    String sqlPassword = "3939939";  
    String user_name;
    String user_password;
    Double remainder;
    Double sum_invest;
    Double income;
	public void Connect() {
		  try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");   
			e.printStackTrace();
		}
			   try {
				connection=DriverManager.getConnection(url,sqlname,sqlPassword);
				statement=connection.createStatement();
				resultSet=statement.executeQuery(sql);
				user_name=resultSet.getString("user_name");
				user_password=resultSet.getString("user_password");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			   finally{
				   if(resultSet!=null)
				   {
					   try {
						   resultSet.close();
					   } catch (SQLException e1) {
						   e1.printStackTrace();
					   }
				   }
				   try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				   try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			   }
	}
	 
}

