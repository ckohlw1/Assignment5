import java.util.ArrayList;

public class ItemIterator implements Iterator {
    ArrayList<menuItem> items = new ArrayList<menuItem>();
    int position = 0;

    public ItemIterator(ArrayList<menuItem> items){
        this.items = items;
    }

    public menuItem next(){
        menuItem MI = items.get(position);
        position = position + 1;
        return MI;
    }

    public boolean hasNext(){
        if (position >= items.size()){
            System.out.println("position is: " + position + " and total size is: " + items.size());
            return false;
        } else {return true;}
    }
}