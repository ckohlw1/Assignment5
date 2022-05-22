
public class Party {
	int members;
	int ID;
	
	public Party(int members, int id) {
		this.members = members;
		this.ID = id;
	}
	
	public String toString() {
		return "ID = " + ID + ", " + members + " members \n";
	}
}
