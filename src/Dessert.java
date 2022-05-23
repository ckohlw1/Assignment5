import java.util.ArrayList;
public class Dessert{
    ArrayList<menuItem> items = new ArrayList<menuItem>();

    public Iterator createII(){
        return new ItemIterator(items);
    }

    public Dessert() {
        items.add(new menuItem(1,"Chocolate Steak",12.99));
        items.add(new menuItem(2,"Chocolate Chicken",10.99));
        items.add(new menuItem(3,"Chocolate Surf & Turf",16.99));
    }

    public void addDish(menuItem item) {
        items.add(item);
    }

    public void displayMenu() {
        Iterator DII = createII();
        while(DII.hasNext()){
            System.out.println(DII.next());
        }
    }
}