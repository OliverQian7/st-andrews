//W04-2-2: CoffeeShop class!
public class CoffeeShop {
    private String name;
    private String address;
    private int stars;
    private Drink[] drinks;
    private static final int MAX_DRINKS = 10;
    private static double totalSales; // record total sales of the chain of coffee shops
    
    public CoffeeShop(String name, String address) {
        this.name = name;
        this.address = address;
        this.drinks = new Drink[MAX_DRINKS];
    }

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

    public void incrementStars() {
        if ( this.stars < 5 ) {
            this.stars++;
        }
    }

    public void decrementStars() {
        if ( this.stars > 0 ) {
            this.stars--;
        }
    }

    // more generic methods to set the drink - in anticipation of using arrays!!!
    public void setDrink(Drink drink) {
        for (int i = 0; i < drinks.length; i++) { 
            if ( drinks[i] == null ) { 
                this.drinks[i] = drink; 
                return; 
            }
        }
    }

    public void setDrink(Drink drink, int index) {
        if (index > 0 && index < drinks.length ) { this.drinks[index-1] = drink; }
    }

    // more generic method to get the drink - in anticipation of using arrays!!!
    public Drink getDrink(int index) {
        if (index > 0 && index < drinks.length ) { return this.drinks[index-1]; }
        return null;
    }

    public void print() {
        System.out.println(name + ", " + address + " " + "★".repeat(stars) + "☆".repeat(5-stars));
    }

    public void printMenu() {
        for (int i = 0; i < drinks.length; i++) { 
            if ( drinks[i] != null ) { 
                System.out.printf("%2d: ", (i+1)); 
                drinks[i].print(); 
            }
        }
    }

    // record each sale into the total sales of the chain of coffee shops
    public void sell(int index) {
        if (index > 0 && index < drinks.length ) { 
            totalSales += (drinks[index-1]!=null)? drinks[index-1].getPrice(): 0.0;
        }
    }

    // get the total sales of the chain of coffee shops
    public static double getTotalSales() {
        return totalSales;
    }
}