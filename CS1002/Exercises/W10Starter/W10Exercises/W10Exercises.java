public class W10Exercises {
    public static void main(String[] args) {
        System.out.println("\n-- Test Mugs --");
        // testing mug
        Mug standardMug = new Mug("Standard", 90, 80);
        Mug smallMug = new Mug("Small", 80, 70);

        standardMug.print();
        smallMug.print();

        // Cuboid depth 72mm, width 70mm, and height 80mm
        // volume 0.403 litres and 2 marshmallows
        CuboidMug cuboidMug = new CuboidMug("Cuboid", 80, 70, 72);
        cuboidMug.print();

        // Conical base width 70mm, top width 68mm, and height 80mm
        // 0.299 litres and marshmallow limit as 1
        ConicalMug conicalMug = new ConicalMug("Conical", 80, 68, 70);
        conicalMug.print();

        // Square size 70
        // volume as 0.343 litres and marshmallow limit as 1
        SquareMug squareMug = new SquareMug("Square", 70);
        squareMug.print();

        System.out.println("\n-- Test Drinks --");
        // testing drink
        Drink espresso = new Drink("Espresso", 2.99, true, squareMug);
        Drink latte = new Drink("Latte", 3.99, true, standardMug);
        Drink chamomile = new Drink("Chamomile Tea", 1.99, false, standardMug);

        espresso.print();
        latte.print();
        chamomile.print();

        System.out.println("\n-- Test Drink's Mug Change --");
        // change the mug chamomile is served in
        chamomile.setMug(smallMug);
        chamomile.print();

        System.out.println("\n-- Test Mug Height Change --");
        // change the size of a small mug
        smallMug.setHeight(75);
        espresso.print();
        latte.print();
        chamomile.print();

        System.out.println("\n-- Test Coffee Shops --");
        CoffeeShop westpoint = new CoffeeShop("WestPoint", "1 West Street, St Andrews");
        westpoint.setDrink(espresso, 1);
        westpoint.setDrink(latte, 2);
        westpoint.printMenu();
        System.out.printf("Should have %d stars:  ", 0);
        westpoint.print();
        westpoint.incrementStars();
        westpoint.incrementStars();
        System.out.printf("Should have %d stars:  ", 2);
        westpoint.print();
        westpoint.incrementStars();
        westpoint.incrementStars();
        westpoint.incrementStars();
        westpoint.incrementStars(); // 6th increment - will it go above 5 stars???
        System.out.printf("Should have %d stars:  ", 5);
        westpoint.print();

        CoffeeShop oval = new CoffeeShop("Cafe in the Oval", "1 Church Street, St Andrews");
        oval.setDrink(chamomile, 1);
        System.out.printf("Should have %d stars:  ", 0);
        oval.print();
        oval.decrementStars(); // decrement - will it go below 0 stars ???
        System.out.printf("Should have %d stars:  ", 0);
        oval.print();
        oval.incrementStars();
        System.out.printf("Should have %d stars:  ", 1);
        oval.print();

        System.out.println(smallMug);
    }
}