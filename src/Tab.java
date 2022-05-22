import java.util.ArrayList;
import java.util.Scanner;
public class Tab {
	ArrayList<menuItem> tab = new ArrayList<menuItem>();
	Orders orders;
	Menu menu;
	Boolean Payed;
	
	public Tab(Menu menu, Orders orders) {
		this.menu = menu;
		this.orders = orders;
		this.Payed = false;
	}
	
	public void DisplayTab() {
		double total = 0;
		
		for(int i = 0; i < orders.itemsOrdered.size(); i++) {
			int order = orders.itemsOrdered.get(i);
			
			for(int j = 0; j < menu.items.size(); j++) {
				
				if(order == menu.items.get(j).number) {
					
					tab.add(menu.items.get(j));
					break;
				}
			}
		}
		
		for(int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
			total += tab.get(i).price;
		}
		System.out.println("Total: " + total); 
	}
	
	public void PayTab() {
		int choice = 0;
		while(choice != 1 && choice != 2) {
			System.out.println("How will you be paying your bill?");
			System.out.println("1) Cash");
			System.out.println("2) Card");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			if(choice == 1) {
				System.out.println("Thank you! Have a nice day");
				Payed = true;
			}else if(choice == 2) {
				System.out.println("Processing ...........");
				System.out.println("Thank you! Have a nice day");
				Payed = true;
			}else {
				System.err.println("INVALID CHOICE");
			}
		}
		//call observer stuff
	}
}
