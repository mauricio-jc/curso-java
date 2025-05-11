package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list = new ArrayList<T>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		
		if(!list.isEmpty()) {
			for(T item: list) {
				System.out.print(item + ", ");
			}
		}
		
		System.out.print("]");
		System.out.println();
	}
}
