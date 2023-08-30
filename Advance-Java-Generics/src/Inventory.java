import java.util.List;
import java.util.ArrayList;


public class Inventory <T> {
	
	// private instance that takes generic type parameter
	
	private List<T> items;
	
	
	// Public constructor with no parameters
	public Inventory() {
		this.items= new ArrayList<>();
	}
		
	// Function to return all items in the instance variable 
	
	public List<T> getItems(){
		return items;
	}
	
	// Function to add item to the List 
	
	public void addItem(T item) {
		items.add(item);
	}
	
	// Function to take item, removes from the list and return updated list 
	public List<T> removeItem(T item) {
		items.remove(item);
		return items;
	}
	//Function to return the number of items in the list 
	public int getInventorySize() {
		return items.size();
	}

}
