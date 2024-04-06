public class ShoppingCentre {
    
    //Attributes
    private Shop[] shops = new Shop[5];
    private int nextShop = 0;

    //Methods
    public void addShop(Shop shop) {
        if (nextShop < 5) {
        shops[nextShop] = shop;
        nextShop++;
        }
    } 

    public void printShops() {
        for (int i = 0; i < nextShop; i++) {
            System.out.println(shops[i].getName());
        }
    }

    //checks if shop exists in particular centre
    public boolean findShop(String name) {
        for (int i = 0; i < nextShop; i++) {
            if (shops[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //prints items in a shop
    public void printShopItems(String name) {
        for (int i = 0; i < nextShop; i++) {
            if (shops[i].getName().equals(name)) {
                shops[i].printItems();
            }
        }       
    }

    //checks if shops in centre carry item
    public boolean checkItem(String item) {
        for (int i=0; i < nextShop; i++) {
            for (int j=0; j < shops[i].getNextItem(); j++) {
                if (shops[i].getItem(j).equals(item)) return true;
            }
        }
        return false;
    }

    //prints stores which carry particular item
    public void printStoreWithItem(String item) {
                for (int i=0; i < nextShop; i++) {
            for (int j=0; j < shops[i].getNextItem(); j++) {
                if (shops[i].getItem(j).equals(item)) System.out.println(shops[i].getName());
            }
        }
    }
}
