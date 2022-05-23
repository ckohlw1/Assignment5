public class DisplayDessertMenuCommand implements Command {
	Menu menu;
	
	public DisplayDessertMenuCommand(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void execute() {
		System.out.println("Desserts");
		menuItem item;
		MenuIterator iterator = menu.getAllItemsIterator();
		
		while(iterator.hasNext()) {
			item = iterator.next();
			if(item.getType() == Menu.DESSERT) {
				System.out.println(item);
			}
		}
	}
}
