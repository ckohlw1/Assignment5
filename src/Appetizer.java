import java.util.ArrayList;
public class Appetizer{
    ArrayList<menuItem> items = new ArrayList<menuItem>();

    public Iterator createII(){
        return new ItemIterator(items);
    }

    public Appetizer() {
        items.add(new menuItem(1,"app Steak",12.99));
        items.add(new menuItem(2,"app Chicken",10.99));
        items.add(new menuItem(3,"app Surf & Turf",16.99));
    }

    public void addDish(menuItem item) {
        items.add(item);
    }

    public void displayMenu() {
        Iterator AppII = createII();
        while(AppII.hasNext()){
            System.out.println(AppII.next());
        }
    }
}