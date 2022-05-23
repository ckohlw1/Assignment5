import java.util.*;
public class Orders implements Observer{
	ArrayList<Integer> itemsOrdered = new ArrayList<Integer>();
	
	public Orders() {}
	
	public void submitOrder(){
		System.out.println("Choose an item off the menu by entering its number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		itemsOrdered.add(num);
	}

	@Override
	public void nextGroup() {
		itemsOrdered.clear();
	}
	
	
	
}
