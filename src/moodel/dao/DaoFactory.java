package moodel.dao;

import db.DB;
import moodel.dao.impl.DepartmentDaoJDBC;
import moodel.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	};
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
