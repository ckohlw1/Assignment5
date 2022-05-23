
public class AppDisplayCommand implements Command {
	Appetizer app;
	
	public AppDisplayCommand(Appetizer app) {
		this.app = app;
	}
	
	@Override
	public void execute() {
		app.displayMenu();
	}

}
