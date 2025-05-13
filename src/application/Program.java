package application;

import model.entities.Seller;
import moodel.dao.DaoFactory;
import moodel.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
				
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(8);		
		System.out.println(seller);

	}

}
