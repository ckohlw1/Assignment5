import java.util.ArrayList;

public class Menu {
	private static Menu singletonInstance;
		ArrayList<menuItem> items = new ArrayList<menuItem>();
		
		public static final int APP = 0;
		public static final int MAIN = 1;
		public static final int DESSERT = 2;
		
		private Menu() {}
		
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
		
		private class AllItemIterator implements MenuIterator {
			int position = 0;
			
			@Override
			public boolean hasNext() {
				if(position >= items.size() || items.get(position) == null) {
				return false;	
				}else {
					return true;
				}
			}

			@Override
			public menuItem next() {
				menuItem temp = items.get(position);
				position++;
				return temp;
			}
		}
		public MenuIterator getAllItemsIterator() {
			return new AllItemIterator();
		}
		private class itemsIterator implements MenuIterator{
			int position = 0;
			
			public itemsIterator(int foodType) {}
			@Override
			public boolean hasNext() {
				if(position > items.size() - 1 || items.get(position) == null) {
					return false;
				}else {
					return true;
				}
			}

			@Override
			public menuItem next() {
				menuItem temp = items.get(position);
				position++;
				return temp;		}
		}
		public MenuIterator getItemsIterator(int foodType) {
			return new itemsIterator(foodType);
		}
		
		
}
