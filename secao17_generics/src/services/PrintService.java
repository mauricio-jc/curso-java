package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	private List<Integer> list = new ArrayList<Integer>();
	
	public void addValue(int value) {
		list.add(value);
	}
	
	public Integer first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		
		if(!list.isEmpty()) {
			for(Integer item: list) {
				System.out.print(item + ", ");
			}
		}
		
		System.out.print("]");
		System.out.println();
	}
}
