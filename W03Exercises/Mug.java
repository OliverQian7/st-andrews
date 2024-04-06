public class Mug {
    private String name;
    private int height;
    private int width;

    public Mug(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    //calculates the surface area of the top of the mug
    public int getTopArea() {
        return (int) (width/2.0 * width/2.0 * Math.PI);
    }

    //calculates the volume of the mug in liters 
    public double getVolume() {
        return height * getTopArea() / 1000000.0;
    }

    //calculates the maximum amount of marshmellows allowed in the mug
    public int getMarshmallowLimit() {
        return (int)(getVolume()/0.2);
    }

    public void print() {
        //System.out.printf("%s mug (%dmm x %dmm)%n", name, height, width);
        System.out.printf("%s mug (%dmm x %dmm), holding %.3fl and up to %d marshmallows.%n", name, height, width, getVolume(), getMarshmallowLimit());
    }
}