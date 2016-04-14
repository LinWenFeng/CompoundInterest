package DBase;

import java.sql.Connection;

import DataBase.ConnectionFactory;

public class RecordSaveDaoTest {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection=ConnectionFactory.getInstane().makeConnection();
			connection.setAutoCommit(false);
			RecordSaveDao recordSaveDao=new RecordSaveDaoImpl();
			RecordSave recordSave=new RecordSave();
			recordSave.setFunction("adb");
			recordSave.setWay("cdy");
			recordSave.setTf1v("sfs");
			recordSave.setTf2v("sf");
			recordSave.setTf3v("dfs");
			recordSave.setTf4v("sfedh");
			recordSave.setTf1n("khj");
			recordSave.setTf2n("jghfg");
			recordSave.setTf3n("dgd");
			recordSave.setTf4n("tgnv");
			recordSaveDao.save(connection, recordSave);
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
