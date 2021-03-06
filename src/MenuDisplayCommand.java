
public class MenuDisplayCommand implements Command {
	Menu menu;
	
	public MenuDisplayCommand(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void execute() {
		System.out.println("Entrees");
		menuItem item;
		MenuIterator iterator = menu.getAllItemsIterator();
		while(iterator.hasNext()) {
			item = iterator.next();
			if(item.getType() == Menu.MAIN) {
				System.out.println(item);
			}
		}

	}

}
