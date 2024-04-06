public class CoffeeShop {
    //attributes
    private String name;
    private String address;
    private int stars;
    private Drink[] drinks;
    private final static int MAX_DRINKS = 10;
    private static double totalRevenue;

    //constructors
    public CoffeeShop(String name, String address) {
        this.name = name;
        this.address = address;
        this.stars = 0;
        this.drinks = new Drink[MAX_DRINKS];
    }

    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStars() {
        return stars;
    }

    public static double getTotalRevenue() {
        return totalRevenue;//no
    }
    
    //methods
    public void incrementStars() {
        if (stars < 5) stars += 1;
    }

    public void decrementStars() {
        if (stars > 0) stars -= 1;
    }

    public void print() {
        System.out.printf("%s Coffee Shop, located at %s with a star rating of %d %n",
        name, address, stars);
    }

    public void printMenu() {
        for (int i = 0; i < MAX_DRINKS; i++) {
            if (drinks[i] != null) {
                System.out.print("Menu Item" + (i+1));
                drinks[i].print();
            }
        }
    }

    public void setDrink(int num, Drink drink) {
        drinks[num-1] = drink;
    }

    public void setDrink(Drink drink) {
        for (int i=0; i < MAX_DRINKS; i++ ) {
            if (drinks[i]==null) { 
            setDrink(i+1, drink);
            break;
            }
        }
    }

    public Drink getDrink(int num) {
        if(num > 0 && num < MAX_DRINKS) return drinks[num-1];
        else return null;
    }

    public void sell(int num) {
        if (num > 0 && num < MAX_DRINKS && drinks[num-1] != null ) {
            totalRevenue += getDrink(num).getPrice();
        }
        
    }
    
}
