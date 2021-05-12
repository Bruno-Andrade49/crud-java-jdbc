package aplication;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//Department department = new Department(2, null);
		/*List<Seller> list = sellerDao.findByDepartment(department);
		Set<Seller> list0 = new HashSet<>();

		for (Seller obj: list) {
			list0.add(obj);
		}
		for (Seller obj: list0) {
			System.out.println(obj);
		}*/
		
		
		
		List<Seller> seller = sellerDao.findAll();
		Set<Seller> list = new HashSet<>();
		
		for (Seller obj: seller) {
			list.add(obj);
		}
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		Seller seller1 = new Seller(null, "Breno", "b.gabriel@hotmail.com", new Date(), 6000.00, new Department(4, null));
		sellerDao.insert(seller1);
		
		System.out.println("----------");
		System.out.println("----------");
		
		
		List<Seller> seller0 = sellerDao.findAll();
		Set<Seller> list0 = new HashSet<>();
		
		for (Seller obj: seller0) {
			list0.add(obj);
		}
		for (Seller obj: list0) {
			System.out.println(obj);
		}
	
	}

}
