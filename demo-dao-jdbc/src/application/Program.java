package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println();
		
		System.out.println("=== TESTE 3: Seller find all ===");
		list = sellerDao.findAll();
		
		for(Seller item: list) {
			System.out.println(item);
		}
		
		System.out.println("=== TESTE 3: Seller find all ===");
		
		System.out.println();
		
		System.out.println("=== TESTE 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, new Department(4, null)); 
		sellerDao.insert(newSeller);
		
		System.out.println("Created! ID: " + newSeller.getId());
		System.out.println("=== TESTE 4: Seller insert ===");
		
		System.out.println();
		
		System.out.println("=== TESTE 5: Seller update ===");
		
		seller = sellerDao.findById(1);
		seller.setName("Fulano");
		sellerDao.update(seller);
		System.out.println("Updated!");
		
		System.out.println("=== TESTE 5: Seller update ===");
		
		System.out.println();
		
		System.out.println("=== TESTE 6: Seller delete ===");
		System.out.print("Informe o id para exclusão: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		sellerDao.deleteById(id);
		
		System.out.println("Deleted!");
		
		System.out.println("=== TESTE 6: Seller delete ===");
		
		sc.close();
	}
}