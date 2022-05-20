import java.util.*;
public class Orders {
	ArrayList<Integer> itemsOrdered = new ArrayList<Integer>();
	
	public Orders() {}
	
	public void submitOrder(){
		System.out.println("Choose and item off the menu by entering its number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		itemsOrdered.add(num);
	}
	
	
	
}
