
public class testing {

	public static void main(String[] args) {
		Menu menu = Menu.getMenu();

		Orders orders = new Orders();
		Tab tab = new Tab(menu,orders);
		waitingGroups waiting = new waitingGroups();
		Waiter waiter = new Waiter();
		Party currentParty = waiting.getNext();
		Command menuDisplay = new MenuDisplayCommand(menu);
		Command orderSubmit = new SubmitOrderCommand(orders);
		Command tabDisplay = new DisplayTabCommand(tab);
		Command payTab = new PayTabCommand(tab);
		

		
		waiter.registerObserver(orders);
		waiter.registerObserver(tab);
		
		waiter.setCommand(0, menuDisplay);
		waiter.setCommand(1, orderSubmit);
		waiter.setCommand(2, tabDisplay);
		waiter.setCommand(3, payTab);
		
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
