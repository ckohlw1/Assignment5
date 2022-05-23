
public class testing {

	public static void main(String[] args) {
		Menu menu = Menu.getMenu();
		Appetizer app = new Appetizer(); //new
		Dessert dess = new Dessert(); //new

		Orders orders = new Orders();
		Tab tab = new Tab(menu,orders);
		waitingGroups waiting = new waitingGroups();
		Waiter waiter = new Waiter();
		Party currentParty = waiting.getNext();
		
		Command menuDisplay = new MenuDisplayCommand(menu);
		Command AppDisplay = new AppDisplayCommand(app); //new
		Command DessDisplay = new DessertDisplayCommand(dess);
		Command orderSubmit = new SubmitOrderCommand(orders);
		Command tabDisplay = new DisplayTabCommand(tab);
		Command payTab = new PayTabCommand(tab);
		
		waiter.registerObserver(orders);
		waiter.registerObserver(tab);
				
		waiter.setCommand(0, AppDisplay);
		waiter.setCommand(1, DessDisplay);
		waiter.setCommand(2, menuDisplay);
		waiter.setCommand(3, orderSubmit);
		waiter.setCommand(4, tabDisplay);
		waiter.setCommand(5, payTab);
		
		for(Party group: waiting.getQueue()) {//for each party
			for(int i = 0; i < currentParty.members; i++) {//asks each guest what they would like, table size is limited to 4
				waiter.executeCommand(0);
				waiter.executeCommand(1);
			}
			waiter.executeCommand(2);
			waiter.executeCommand(3);
		}

	}

}
