//W04-2-1: Drink class!
public class Drink {
    private String name;
    private double price;
    private final boolean isCaffeinated; //immutable caffeination
    private Mug mug;
    
    public Drink(String name, double price, boolean caffeinated, Mug mug) {
        this.name = name;
        this.price = price;
        this.isCaffeinated = caffeinated;
        this.mug = mug;
    }

    public Drink(String name, double price, Mug mug) {
        this(name, price, true, mug);
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

    public boolean isCaffeinated() {
        return isCaffeinated;
    }

    public Mug getMug() {
        return mug;
    }

    public void setMug(Mug mug) {
        this.mug = mug;
    }

    public void print() {
        System.out.print(name + " \u00a3" + price);
        if (isCaffeinated) {
            System.out.print(" (contains caffeine)");
        }
        else {
            System.out.print(" (uncaffeinated)");
        }
        System.out.print(". Served in ");
        mug.print();
    }
}
