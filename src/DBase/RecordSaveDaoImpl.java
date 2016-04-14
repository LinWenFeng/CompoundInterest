package DBase;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class RecordSaveDaoImpl implements RecordSaveDao {

	@Override
	public void save(Connection connection, RecordSave recordSave)
			throws SQLException {
		System.out.println("保存方法");
		PreparedStatement pStatement=(PreparedStatement) connection.
				prepareCall("INSERT INTO record(function,way,tf1v,tf2v,tf3v,tf4v,tf1n,tf2n,tf3n,tf4n)VALUES(?,?,?,?,?,?,?,?,?,?)");
		pStatement.setString(1,recordSave.getFunction());
		pStatement.setString(2,recordSave.getWay());
		pStatement.setString(3, recordSave.getTf1v());
		pStatement.setString(4, recordSave.getTf2v());
		pStatement.setString(5, recordSave.getTf3v());
		pStatement.setString(6, recordSave.getTf4v());
		pStatement.setString(7, recordSave.getTf1n());
		pStatement.setString(8, recordSave.getTf2n());
		pStatement.setString(9, recordSave.getTf3n());
		pStatement.setString(10, recordSave.getTf4n());
		pStatement.execute();
		System.out.println("操作成功");
	}

	@Override
	public void update(Connection connection, RecordSave recordSave)
			throws SQLException {
		String updateSql="UPDATE user SET name=?,password=?,emil=? WHERE id= ?";
		PreparedStatement pStatement= (PreparedStatement) connection.prepareCall(updateSql);
		pStatement.setString(1, recordSave.getFunction());
		pStatement.execute();

	}

	@Override
	public void delete(Connection connection, RecordSave recordSave)
			throws SQLException {
		PreparedStatement pStatement=(PreparedStatement) connection
				.prepareCall("DELET FROM user2 WHERE id=?");
		//pStatement.setLong(1, user.getId());
		pStatement.execute();
	}

}
