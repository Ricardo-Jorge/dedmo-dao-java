package application;

import java.util.List;

import model.entities.Department;
import moodel.dao.DaoFactory;
import moodel.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: Department findById ====");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n==== TEST 2: Department findAll ====");
		List<Department> list = departmentDao.findAll();
		
		for (Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 3: Department insert ====");
		Department newDep = new Department(null, "Test");
		//departmentDao.insert(newDep);
		
		System.out.println("\n==== TEST 4: Department update ====");
		dep = departmentDao.findById(7);
		dep.setName("Test");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n==== TEST 5: Department deleteById ====");
		departmentDao.deleteById(7);
		
	}

}
