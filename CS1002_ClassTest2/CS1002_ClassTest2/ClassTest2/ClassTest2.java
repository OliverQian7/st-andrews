import java.util.Scanner;

public class ClassTest2 { 

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        ClassTest2 test = new ClassTest2();
        test.selectQuestion();
    }

    public void selectQuestion() {

        System.out.println("Enter choice:");
        String number = reader.nextLine();
        
        switch (number) {
        
            case("1"): recordAndPrintShops(); break;
            case("2"): findItemsForShop(); break;
            case("3"): findShopsSellingItem(); break;
        }
    }

    //creates shopping centre and list of shops within centre and then prints list of shops
    public void recordAndPrintShops() {

        ShoppingCentre centre = new ShoppingCentre();

        System.out.println("Enter name of shop, or 'done' to finish:");
        String shopName = reader.nextLine();

        while (!shopName.equals("done")) {

            Shop shop = new Shop(shopName);
            centre.addShop(shop);
            
            System.out.println("Enter name of shop, or 'done' to finish:");
            shopName = reader.nextLine();
        }

        centre.printShops();
    }

    //creates shopping centre, list of shops within centre and items sold within each shop and then prints list of items in a shop of the user's choice
    public void findItemsForShop() {

        ShoppingCentre centre = new ShoppingCentre();
        
        System.out.println("Enter name of shop, or 'done' to finish:");
        String shopName = reader.nextLine();
         while (!shopName.equals("done")) {
            Shop shop = new Shop(shopName);
            centre.addShop(shop);
            System.out.println("Enter description of item, or 'done' to finish:");
            String itemName = reader.nextLine();
            while (!itemName.equals("done")) {
                shop.addItem(itemName);
                System.out.println("Enter description of item, or 'done' to finish:");
                itemName = reader.nextLine();
            }
            System.out.println("Enter name of shop, or 'done' to finish:");
            shopName = reader.nextLine();
        }

        System.out.println("Enter name of shop to look up:");
        shopName = reader.nextLine();
        
        if (centre.findShop(shopName)) centre.printShopItems(shopName);
        else System.out.println(shopName+" not found");
    }

    //creates shopping centre, list of shops within centre and items sold within each shop and then prints list of shops that carry an item of the user's choice
    public void findShopsSellingItem() {
    
        ShoppingCentre centre = new ShoppingCentre();
        
        System.out.println("Enter name of shop, or 'done' to finish:");
        String shopName = reader.nextLine();
         while (!shopName.equals("done")) {
            Shop shop = new Shop(shopName);
            centre.addShop(shop);
            System.out.println("Enter description of item, or 'done' to finish:");
            String itemName = reader.nextLine();
            while (!itemName.equals("done")) {
                shop.addItem(itemName);
                System.out.println("Enter description of item, or 'done' to finish:");
                itemName = reader.nextLine();
            }
            System.out.println("Enter name of shop, or 'done' to finish:");
            shopName = reader.nextLine();
        }        

        System.out.println("Enter item to look up:");
        String item = reader.nextLine();

        if (centre.checkItem(item)) centre.printStoreWithItem(item);
        else System.out.println(item+" not sold in these shops");
    }
}
