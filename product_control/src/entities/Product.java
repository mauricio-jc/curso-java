package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	public String toString() {
		return "Nome: " + name + 
				" - Preço: R$ " + String.format("%.2f", price) + 
				" - Quantidade: " + quantity + 
				" unidade(s) - Total: R$ " + String.format("%.2f", totalValueInStock());	
	}
}
