package application;

import java.util.Date;
import java.util.List;

import model.entities.Department;
import model.entities.Seller;
import moodel.dao.DaoFactory;
import moodel.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
				
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(8);		
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		
		for (Seller obj: list) {
			System.out.println(obj);
		}

		System.out.println("\n==== TEST 4: seller insert ====");
		Seller newSeller =  new Seller(null, "Bob Brown", "bob.b@gmail.com", new Date(), 4090.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println("\n==== TEST 5: seller update ====");
		seller = sellerDao.findById(9);
		seller.setBaseSalary(4090.0);
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n==== TEST 6: seller delete ====");
		sellerDao.deleteById(10);
	}
		
		

}
