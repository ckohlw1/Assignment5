
public class testing {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.addDish(new menuItem(1,"Steak",12.99));
		menu.addDish(new menuItem(2,"Chicken",10.99));
		menu.addDish(new menuItem(3,"Surf & Turf",16.99));
		Orders orders = new Orders();
		Tab tab = new Tab(menu,orders);
		invoker invoke = new invoker();
		
		Command menuDisplay = new MenuDisplayCommand(menu);
		invoke.setCommand(menuDisplay);
		invoke.runCommand();
		
		Command orderSubmit = new SubmitOrderCommand(orders);
		invoke.setCommand(orderSubmit);
		invoke.runCommand();
		invoke.runCommand();
		invoke.runCommand();
		
		Command tabDisplay = new DisplayTabCommand(tab);
		invoke.setCommand(tabDisplay);
		invoke.runCommand();
	}

}
