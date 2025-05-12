package application;

import model.entities.Seller;
import moodel.dao.DaoFactory;
import moodel.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
				
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(7);
		
		System.out.println(seller);

	}

}
