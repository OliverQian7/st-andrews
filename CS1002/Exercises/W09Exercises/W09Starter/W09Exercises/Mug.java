public class Mug {
    //W03-1-1: attributes
    private String name;
    private int height;
    private int width;
    private static final double LITRES_PER_MALLOW = 0.2;

    //W03-1-2: add constructor
    public Mug(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    //W03-1-3 & W03-1-4: getters & setters
    public String getName() {
        return name;
    }
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void print() {
        System.out.printf("%s mug (%dmm x %dmm), holding %.3fl and up to %d marshmallows.%n", 
            name, height, width, getVolume(), getMarshmallowLimit());
    }


    //W03-2-1: method for top surface area
    //calculate area of the top of the mug
    public int getTopArea() {
        return (int)(width/2.0 * width/2.0 * Math.PI);
    }
    
    //W03-2-2: method for top volume
    //calculate volume of mug
    public double getVolume() {
        return height * getTopArea()/ 1000000.0; //call method to calculate area of the top of the mug
    }

    //W03-2-3: method for marshmallow limit
    //calculate how many marshmallows will fit in the mug
    public int getMarshmallowLimit() {
        double volume = getVolume();
        return (int)(volume/LITRES_PER_MALLOW);
    }
}
