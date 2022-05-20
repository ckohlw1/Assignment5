
public class testing {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.addDish(new menuItem(1,"Steak",12.99));
		menu.addDish(new menuItem(2,"Chicken",10.99));
		menu.addDish(new menuItem(3,"Surf & Turf",16.99));
		
		Orders orders = new Orders();
		
		menu.displayMenu();
		
		orders.submitOrder();
		orders.submitOrder();
		orders.submitOrder();
		
		Tab tab = new Tab(menu,orders);
		
		tab.DisplayTab();
	}

}
