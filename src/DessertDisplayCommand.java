
public class DessertDisplayCommand implements Command {
	Dessert dess;
	
	public DessertDisplayCommand(Dessert dess) {
		this.dess = dess;
	}
	
	@Override
	public void execute() {
		dess.displayMenu();
	}

}
