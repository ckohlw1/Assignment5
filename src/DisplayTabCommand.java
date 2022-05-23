public class DisplayTabCommand implements Command {

	Tab tab;
	
	public DisplayTabCommand(Tab tab) {
		this.tab = tab;
	}
	@Override
	public void execute() {
		tab.DisplayTab();
	}

}
