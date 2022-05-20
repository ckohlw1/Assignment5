import java.util.ArrayList;
public class Menu {
		ArrayList<menuItem> items = new ArrayList<menuItem>();
		
		public Menu() {}
		
		public void addDish(menuItem item) {
			items.add(item);
		}
		
		public void displayMenu() {
			for(int i = 0; i < items.size(); i++) {
				System.out.println(items.get(i));
			}
		}
		
}
