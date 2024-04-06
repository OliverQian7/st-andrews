public class CuboidMug extends Mug {
    private int depth;

    public CuboidMug(String name, int height, int width, int depth) {
        super(name, height, width);
        this.depth = depth;
    }
    
    @Override
    public int getTopArea() {
        return getWidth() * this.depth;
    }

}
