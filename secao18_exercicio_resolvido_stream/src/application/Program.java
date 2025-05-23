package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\Mauricio\\Documents\\prod.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> list = new ArrayList<Product>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double average = list.stream()
							.map(p -> p.getPrice())
							.reduce(0.0, (x, y) -> x + y) / list.size();
			
			System.out.println("Preço médio: " + String.format("%.2f", average));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
								.filter(p -> p.getPrice() < average)
								.map(p -> p.getName())
								.sorted(comp.reversed())
								.collect(Collectors.toList());
			
			names.forEach(System.out::println);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}