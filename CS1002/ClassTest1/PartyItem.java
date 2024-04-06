public class PartyItem {
    //Fields
    private String name;
    private double price;
    private double numberPerGuest;

    //Constructor
    public PartyItem(String name, double price, double numberPerGuest) {
        this.name = name;
        this.price = price;
        this.numberPerGuest = numberPerGuest;
    }

    //TODO: Calculates the number of a certain item needed based on the number of guests
    public int calculateNumberNeeded(int numOfGuests){
        double itemsNeeded = (double)numOfGuests * numberPerGuest;
        int result = (int)Math.ceil(itemsNeeded);
        return result;
    }
    //Caculates the cost of the party item based on the number of guests and the number of items needed
    public double calculateCost(int numOfGuests) {
        double cost = (double)calculateNumberNeeded(numOfGuests) * price;
        return cost;
    }
    //prints information about the item
    public void print(int numOfGuests) {
       System.out.printf("For %d guests, you need %d %s at a total cost of \u00a3%.2f%n", numOfGuests, calculateNumberNeeded(numOfGuests), name, calculateCost(numOfGuests)); 
    }
}