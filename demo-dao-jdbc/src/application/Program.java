package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TESTE 1: Seller find by id ===");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		System.out.println("=== TESTE 1: Seller find by id ===");
		
		System.out.println();
		
		System.out.println("=== TESTE 2: Seller find by department ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(1, null));
		
		for(Seller item: list) {
			System.out.println(item);
		}
		
		System.out.println("=== TESTE 2: Seller find by department ===");
	}
}