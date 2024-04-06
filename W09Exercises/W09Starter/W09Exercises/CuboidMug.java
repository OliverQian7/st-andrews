public class CuboidMug extends Mug {
    //Attributes
    private int depth;

    //Constructor
    public CuboidMug(String name, int height, int width, int depth) {
        super(name, height, width);
        this.depth = depth;
    }

    //Methods
    public int getCuboidTopArea() {
        return this.getWidth() * depth;
    }

    public double getVolume() {
        return this.getHeight() * this.getCuboidTopArea() / 1000000.0;
    }

    public int getCuboidMarshmallowLimit() {
        return super.getMarshmallowLimit();
    }

    public void printCuboid() {
            System.out.printf("%s mug (%dmm x %dmm x %dmm), holding %.3fl and up to %d marshmallows.%n", 
                this.getName(), this.getHeight(), this.getWidth(), depth, getVolume(), getCuboidMarshmallowLimit());
    }
}
