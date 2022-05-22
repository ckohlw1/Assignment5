
public class PayTabCommand implements Command {
	Tab tab;
	
	public PayTabCommand(Tab tab) {
		this.tab = tab;
	}
	@Override
	public void execute() {
		tab.PayTab();
	}

}
