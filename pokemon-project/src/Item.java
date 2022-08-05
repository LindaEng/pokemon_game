
public class Item {
	private String name;
	private Integer quantity;
	private String description;
	
	public Item() {
		this.description = "A general Item";
	}
	
	//getters
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	//setters
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	//methods
	public void useItem(Pokemon pokemon) {
		System.out.println("item has been used!");
	}
	
	//toString
	@Override
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + ", description=" + description + ", getDescription()="
				+ getDescription() + ", getName()=" + getName() + ", getQuantity()=" + getQuantity() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
