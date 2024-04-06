public class W08Exercises {
    public static void main(String[] args) {
        //W03-1-6: Test the Mug class
        Mug mug1 = new Mug("Standard", 90,80);
        Mug mug2 = new Mug("Small", 80,70);

        mug1.print();
        mug2.print();

        mug2.setHeight(70);
        mug2.setWidth(75);

        mug1.print();
        mug2.print();

        Drink drink1 = new Drink("esspresso", 5.00, mug2);
        Drink drink2 = new Drink("latte", 6.25, mug1);
        Drink drink3 = new Drink("Chomile Tea", 4.50, false, mug1);

        drink1.print();
        drink2.print();
        drink3.print();

        CoffeeShop shop1 = new CoffeeShop("Westpoint", "1873 H-- Lane");
        CoffeeShop shop2 = new CoffeeShop("Cafe In the Oval", "223 Oval Street");

        shop1.print();
        shop2.print();
        shop1.setDrink(drink2);
        shop1.setDrink(drink3);
        shop1.setDrink(drink1);
        shop1.printMenu(); 
        shop1.sell(1);
        shop1.sell(3);
        System.out.println(shop1.getTotalRevenue());
    }
}
 