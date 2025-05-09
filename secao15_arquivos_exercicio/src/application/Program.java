package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o arquivo de entrada: ");
		String filePath = sc.nextLine();
		File path = new File(filePath);
		
		String newFolder = path.getParent() + "\\out";
		new File(newFolder).mkdir();
		String newFile = newFolder + "\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] infos = line.split(",");
				String name = infos[0];
				double price = Double.parseDouble(infos[1]);
				int quantity = Integer.parseInt(infos[2]);
				
				Product product = new Product(name, price, quantity);
				double total = product.total();
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true))) {
					bw.write(product.getName() + "," + total);
					bw.newLine();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
				
				line = br.readLine();
			}
			
			System.out.println("Arquivo criado com sucesso");
		}
		catch (IOException e) {
			System.out.println("Catch Exception: " + e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Finally");
		}
	}
}