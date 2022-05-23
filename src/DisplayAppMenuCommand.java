public class DisplayAppMenuCommand implements Command {
	Menu menu;
	
	public DisplayAppMenuCommand(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void execute() {
		System.out.println("Appetizers");
		menuItem item;
		MenuIterator iterator = menu.getItemsIterator(Menu.APP);
		while(iterator.hasNext()) {
			item = iterator.next();
			if(item.getType() == Menu.APP) {
				System.out.println(item);
			}
		}
	}
}
