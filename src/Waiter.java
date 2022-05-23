import java.util.*;
public class Waiter implements Subject {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
	ArrayList<Command> commands = new ArrayList<Command>();
	
	
	public Waiter() {}
	
	public void seatGuests() {
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= observers.size()) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.nextGroup();
		}
	}
	
	public void setCommand(int slot, Command command) {
		commands.add(slot, command);
	}
	public void executeCommand(int slot) {
		Command temp = commands.get(slot);
		temp.execute();
		if(temp instanceof PayTabCommand) { //checks if the command that is run is to pay the tab, meaning the party is leaving the table
			notifyObservers();
		}
	}
	
}	