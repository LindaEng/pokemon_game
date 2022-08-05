import java.util.ArrayList;

public class Bag {
	private Integer itemCount;
	private Trainer trainer;
	private Integer storageLimit;
	private ArrayList<Item> items;
	
	//Constructor
	public Bag() {
		this.itemCount = 0;
		this.storageLimit = 50;
	}
	
	//Getters 
	public Integer getItemCount() {
		return this.itemCount;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public Integer getStorageLimit() {
		return storageLimit;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	
	//Setters
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}
	
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void setStorageLimit(Integer storageLimit) {
		this.storageLimit = storageLimit;
	}
	
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}
