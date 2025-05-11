package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 2, 4);
		printList(list);
		
		List<String> listStr = Arrays.asList("Maria", "Alex", "Bob");
		printList(listStr);
	}
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
}
