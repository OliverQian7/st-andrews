public class Shop {

    //Attributes
    private String name;
    private String[] items = new String[5];
    private int nextItem = 0;
    
    //Constructor
    public Shop (String name) {
        this.name = name;
    }

    //Methods
    public void addItem(String item) {
        if (nextItem < 5) {
        items[nextItem] = item;
        nextItem++;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getItem(int num) {
        return items[num];
    }

    public int getNextItem() {
        return this.nextItem;
    }

    public void printItems() {
        for (int i = 0; i < nextItem; i++) {
            System.out.println(items[i]);
        }
    }

} 
