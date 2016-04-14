package DBase;

import java.sql.Connection;
import java.sql.SQLException;

public interface RecordSaveDao {
	public void save(Connection connection,RecordSave recordSave)throws SQLException;
	public void update(Connection connection ,RecordSave recordSave)throws SQLException;
	public void delete(Connection connection ,RecordSave recordSave)throws SQLException;
}
