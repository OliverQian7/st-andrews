import java.util.Scanner;

public class PartyMain {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many guests are coming to your party?");
        int guests = reader.nextInt();

        //displays error message and reprompts user if user enters a negative number 
        while (guests < 0) {
            System.out.println("Error: You cannot have a negative number of guests.");
            System.out.println("How many guests are coming to your party?");
            guests = reader.nextInt();
        }
    
        //creates 4 PartyItem objects based on the information from the specification
        PartyItem balloon = new PartyItem("balloons", 0.10, 1.0);
        PartyItem sausageRoll = new PartyItem("mini sausage rolls", 0.50, 2.0);
        PartyItem sandwich = new PartyItem("plates of sandwiches", 1.25, 0.25);
        PartyItem cake = new PartyItem("birthday cakes", 50.0, 0.05);

        //prints information about the 4 PartyItem objects
        balloon.print(guests);
        sausageRoll.print(guests);
        sandwich.print(guests);
        cake.print(guests);

        double totalCost = 0;

        //Calculates the total cost of the 4 items
        totalCost = balloon.calculateCost(guests) + sausageRoll.calculateCost(guests) + sandwich.calculateCost(guests) + cake.calculateCost(guests);

        //prints the totalCost of the items
        System.out.printf("Total cost for your party is \u00a3%.2f%n", totalCost);
    }
}