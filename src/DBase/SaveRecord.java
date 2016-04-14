package DBase;

import java.sql.Connection;

import DataBase.ConnectionFactory;

public class SaveRecord {
	public SaveRecord(String itemstate,String way,Double tf1v,Double tf2v,Double tf3v,Double tf4v
			,String tf1n,String tf2n,String tf3n,String tf4n) {
		Connection connection=null;
		try {
			connection=ConnectionFactory.getInstane().makeConnection();
			connection.setAutoCommit(false);
			RecordSaveDao recordSaveDao=new RecordSaveDaoImpl();
			RecordSave recordSave=new RecordSave();
			recordSave.setFunction(itemstate);
			recordSave.setWay(way);
			recordSave.setTf1v(tf1v.toString());
			recordSave.setTf2v(tf2v.toString());
			recordSave.setTf3v(tf3v.toString());
			recordSave.setTf4v(tf4v.toString());
			recordSave.setTf1n(tf1n);
			recordSave.setTf2n(tf2n);
			recordSave.setTf3n(tf3n);
			recordSave.setTf4n(tf4n);
			recordSaveDao.save(connection, recordSave);
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
