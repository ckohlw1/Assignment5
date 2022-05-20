
public class SubmitOrderCommand implements Command {
	Orders orders;
	
	public SubmitOrderCommand(Orders orders) {
		this.orders = orders;
	}
	@Override
	public void execute() {
		orders.submitOrder();
	}

}
