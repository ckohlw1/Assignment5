
public class menuItem {
	int number;
	String name;
	int type;
	double price;
	
	public menuItem(int number, int type,String name, double price) {
		this.number = number;
		this.type = type;
		this.name = name;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return number + ", " + name + " $" + price;
	}
	
	public int getType() {
		return this.type;
	}
}
