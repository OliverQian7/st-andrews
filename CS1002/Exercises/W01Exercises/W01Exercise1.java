import cs1002.burgers.*; //so we can create Burger and MultiBurgerDisplay objects

public class W01Exercise1 {
    public static void main(String[] args) {
        //create a Burger object with no name or price
        Burger burger = new Burger();

        //TODO: Add some ingredients to the burger 
        burger.addBottomBun();
        burger.addPatty();
        burger.addCheese();
        burger.addLettuce();
        burger.addTomato();
        burger.addGherkins();
        burger.addBacon();
        burger.addTopBun();
        burger.setName("Baconator");
        burger.setPrice(4.99);

        Burger burger2 = new Burger("Salad", 1.20);
        burger2.addLettuce();
        burger2.addLettuce();
        burger2.addTomato();
        burger2.addLettuce();

        //display the burger
        MultiBurgerDisplay displayer = new MultiBurgerDisplay(true);
        displayer.add(burger);
        displayer.add(burger2);
    }
} //h