import java.util.ArrayList;

public class Tab {
	ArrayList<menuItem> tab = new ArrayList<menuItem>();
	Orders orders;
	Menu menu;
	
	public Tab(Menu menu, Orders orders) {
		this.menu = menu;
		this.orders = orders;
		
		for(int i = 0; i < this.orders.itemsOrdered.size(); i++) {
			int order = this.orders.itemsOrdered.get(i);
			
			for(int j = 0; j < this.menu.items.size(); j++) {
				
				if(order == this.menu.items.get(j).number) {
					
					tab.add(this.menu.items.get(j));
					break;
				}
			}
		}
	}
	
	public void DisplayTab() {
		double total = 0;
		for(int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
			total += tab.get(i).price;
		}
		System.out.println("Total: " + total); 
	}
	
}
