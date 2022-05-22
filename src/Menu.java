import java.util.ArrayList;
public class Menu {
	private static Menu singletonInstance;
		ArrayList<menuItem> items = new ArrayList<menuItem>();
		
		private Menu() {
			items.add(new menuItem(1,"Steak",12.99));
			items.add(new menuItem(2,"Chicken",10.99));
			items.add(new menuItem(3,"Surf & Turf",16.99));
		}
		
		public static Menu getMenu() {
			if(singletonInstance == null) {
				singletonInstance = new Menu();
			}
			return singletonInstance;
		}
		
		public void addDish(menuItem item) {
			items.add(item);
		}
		
		public void displayMenu() {
			for(int i = 0; i < items.size(); i++) {
				System.out.println(items.get(i));
			}
		}
		
}
