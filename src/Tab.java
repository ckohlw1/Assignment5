import java.util.ArrayList;

public class Tab {
	ArrayList<menuItem> tab = new ArrayList<menuItem>();
	Orders orders;
	Menu menu;
	
	public Tab(Menu menu, Orders orders) {
		this.menu = menu;
		this.orders = orders;
		
		
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
	
}
