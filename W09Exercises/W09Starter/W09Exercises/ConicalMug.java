public class ConicalMug extends Mug {
    //Attributes
    private int baseWidth;

    //Constructor
    public ConicalMug(String name, int height, int width, int baseWidth) {
        super(name, height, width);
        this.baseWidth = baseWidth;
    }

    //Methods
    public double getVolume() {
        if (getWidth() == baseWidth) return super.getVolume();
        double topRadius = (double)this.getWidth()/2.0;
        double baseRadius = (double)baseWidth/2.0;
        if (baseWidth > getWidth()) {
            double temp = topRadius;
            topRadius = baseRadius;
            baseRadius = temp;
        }
        double topArea = Math.PI*Math.pow(topRadius,2);
        double baseArea = Math.PI*Math.pow(baseRadius,2);
        double heightExtension = (double)getHeight()*baseRadius/(topRadius-baseRadius);
        double totalHeight = heightExtension+(double)getHeight();
        double coneVolume = topArea * totalHeight/3.0;
        double extentionVolume = baseArea * heightExtension/3.0;
        return (coneVolume-extentionVolume)/1000000.0;
    }

    public int getConicalMarshmallowLimit() {
        return super.getMarshmallowLimit();
    }

    public void printConcial() {
            System.out.printf("%s mug with height of %dmm, top width of %dmm and base width of %dmm, holding %.3fl and up to %d marshmallows.%n", 
            getName(), getHeight(), getWidth(), baseWidth, getVolume(), getMarshmallowLimit());
    }
}
