import java.util.LinkedList;
import java.util.Queue;
public class waitingGroups {
	Queue<Party> groups = new LinkedList<>();
	
	public waitingGroups() {
		int count = 5;
		int tableSize = 4;
		
		for(int i = 0; i < count; i++) {
			int guests = (int) ((Math.random() * (tableSize - 1)) + 1); 
			groups.add(new Party(guests,i));
		}
	}
	
	public Party getNext() {
		return groups.poll();
		
	}
	public Queue<Party> getQueue() {
		return this.groups;
	}
	
}
