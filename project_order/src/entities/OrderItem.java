package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		this.price = this.product.getPrice();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName() + ", " +
				"$" + price + ", " +
				"Quantidade: " + quantity + ", " +
				"Subtotal: $" + subTotal();
	}
}
