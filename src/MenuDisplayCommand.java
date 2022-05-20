
public class MenuDisplayCommand implements Command {
	Menu menu;
	
	public MenuDisplayCommand(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void execute() {
		menu.displayMenu();

	}

}
