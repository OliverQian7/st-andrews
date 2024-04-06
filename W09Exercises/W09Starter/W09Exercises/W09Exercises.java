public class W09Exercises {
    public static void main(String[] args) {
        System.out.println("\n-- Test Mugs --");
        //testing mug
        Mug standardMug = new Mug("Standard", 90,80);
        Mug smallMug = new Mug("Small", 80,70);
        CuboidMug cubeMug = new CuboidMug("Cube", 80, 70, 72);
        ConicalMug cone = new ConicalMug("Cone", 80,68,70);
        SquareMug square = new SquareMug("Square", 70);
        ConicalMug nonCone = new ConicalMug("h", 80, 70, 70);
        standardMug.print();
        smallMug.print();  
        cubeMug.printCuboid();
        cone.printConcial();
        square.printCuboid();
        nonCone.printConcial();
    }
}