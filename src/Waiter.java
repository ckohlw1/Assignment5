import java.util.*;
public class Waiter implements Subject {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
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

}
