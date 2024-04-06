import java.util.Scanner;

public class W02Exercise1 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        for (int i=0; i<3; i++) {
            System.out.println("Price "+(i+1)+":");
            sum = sum + reader.nextDouble();
        }
        /*System.out.println("Price 1:");
        double price1 = reader.nextDouble();
        System.out.println("Price 2:");
        double price2 = reader.nextDouble();
        System.out.println("Price 3:");
        double price3 = reader.nextDouble();
        */double avg = (sum)/3;
        System.out.println("The average price is " + avg);
    }
}