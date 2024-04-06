public class Drink {
    //attributes
    private String name;
    private double price;
    private final boolean hasCaffeine;
    private Mug mug;

    //constructors
    public Drink(String name, double price, boolean hasCaffeine, Mug mug) {
        this.name = name;
        this.price = price;
        this.hasCaffeine = hasCaffeine;
        this.mug = mug;
    }

    public Drink(String name, double price, Mug mug) {
        this(name, price, true, mug);
    }

    //getter and setters
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

    public boolean hasCaffeine() {
        return hasCaffeine;
    }

    public Mug getMug() {
        return mug;
    }

    public void setMug(Mug mug) {
        this.mug = mug;
    }

    //methods
    public void print() {
        System.out.printf("%s drink in %s mug (%dmm x %dmm), holding %.3fl and up to %d marshmallows %n Price: $%.2f %n Contains Caffiene: %B %n",
        name, mug.getName(), mug.getHeight(), mug.getWidth(), mug.getVolume(), mug.getMarshmallowLimit(), price, hasCaffeine );
    }

}
