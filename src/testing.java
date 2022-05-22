
public class testing {

	public static void main(String[] args) {
		Menu menu = Menu.getMenu();

		Orders orders = new Orders();
		Tab tab = new Tab(menu,orders);
		invoker invoke = new invoker();
		waitingGroups waiting = new waitingGroups();
		
		Command menuDisplay = new MenuDisplayCommand(menu);
		Command orderSubmit = new SubmitOrderCommand(orders);
		Command tabDisplay = new DisplayTabCommand(tab);
		Command payTab = new PayTabCommand(tab);
		
		invoke.setCommand(menuDisplay);
		invoke.runCommand();
				
		invoke.setCommand(orderSubmit);
		invoke.runCommand();
		invoke.runCommand();
		invoke.runCommand();
		
		invoke.setCommand(tabDisplay);
		invoke.runCommand();
		
		invoke.setCommand(payTab);
		invoke.runCommand();
		
		
	}

}
