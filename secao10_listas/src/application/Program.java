package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String item: list) {
			System.out.println(item);
		}
		
		System.out.println("----------------------");
		
//		list.remove("Ana");
//		list.remove(1);
//		
//		list.removeIf(x -> x.charAt(0) == 'B');
		
		for(String item: list) {
			System.out.println(item);
		}
		
		System.out.println("----------------------");
		
		System.out.println("Index of: " + list.indexOf("Maria"));
		System.out.println("Index of: " + list.indexOf("Antonio"));
		
		System.out.println("----------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String item: result) {
			System.out.println(item);
		}
		
		System.out.println("----------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}













