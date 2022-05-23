
public class testing {

	public static void main(String[] args) {
		Menu menu = Menu.getMenu();
		menu.addDish(new menuItem(0,Menu.APP,"Boneless Wings",9.99));
		menu.addDish(new menuItem(1,Menu.APP,"Bread Sticks",4.99));
		menu.addDish(new menuItem(2,Menu.APP,"Mac & Cheese",6.99));
		menu.addDish(new menuItem(3,Menu.MAIN,"8oz Steak",12.99));
		menu.addDish(new menuItem(4,Menu.MAIN,"Chicken",13.99));
		menu.addDish(new menuItem(5,Menu.MAIN,"Roast Beef",15.99));
		menu.addDish(new menuItem(6,Menu.DESSERT,"Cheese Cake",8.99));
		menu.addDish(new menuItem(7,Menu.DESSERT,"CHOCOLATE!!",28.99));
		menu.addDish(new menuItem(8,Menu.DESSERT,"Cinna Sticks",18.99));

		
		
		Orders orders = new Orders();
		Tab tab = new Tab(menu,orders);
		waitingGroups waiting = new waitingGroups();
		Waiter waiter = new Waiter();
		Party currentParty = waiting.getNext();
		
		Command MainDisplay = new MenuDisplayCommand(menu);
		Command orderSubmit = new SubmitOrderCommand(orders);
		Command tabDisplay = new DisplayTabCommand(tab);
		Command payTab = new PayTabCommand(tab);
		Command AppDisplay = new DisplayAppMenuCommand(menu);
		Command DessDisplay = new DisplayDessertMenuCommand(menu);
		waiter.registerObserver(orders);
		waiter.registerObserver(tab);
				
		waiter.setCommand(0, AppDisplay);
		waiter.setCommand(1, MainDisplay);
		waiter.setCommand(2, DessDisplay);	
		waiter.setCommand(3, orderSubmit);
		waiter.setCommand(4, tabDisplay);
		waiter.setCommand(5, payTab);
		
		for(Party group: waiting.getQueue()) {//for each party
			System.out.println("Welcome to C & D");
			for(int i = 0; i < group.members; i++) {//asks each guest what they would like, table size is limited to 4
				waiter.executeCommand(0);
				System.out.println();
				waiter.executeCommand(3);
			}
			for(int i = 0; i < group.members; i++) {//asks each guest what they would like, table size is limited to 4
				waiter.executeCommand(1);
				System.out.println();
				waiter.executeCommand(3);
			}
			for(int i = 0; i < group.members; i++) {//asks each guest what they would like, table size is limited to 4
				waiter.executeCommand(2);
				System.out.println();
				waiter.executeCommand(3);
			}
			waiter.executeCommand(4);
			waiter.executeCommand(5);
			System.out.println();
			System.out.println();
		}

	}

}





