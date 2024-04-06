import java.util.*;
 
public class UserInterfaceMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.printf("What would you like to do? %n1. Pretty print a baking measure. %n2. Convert metric volume to baking measure.%n");
        int num = read.nextInt();

        // handle different user inputs
        switch (num) {
            case 1:
                bakingMeasureInput(read);
                break;

            case 2:
                metricVolumeInput(read);
                break;

            default:
                System.out.println("Invalid choice. Goodbye.");
        }
    }

    // asks user for number of cups, tablespoons and teaspoons, creates a BakingMeasure object and calls the prettyPrint method with the user input  
    public static void bakingMeasureInput(Scanner read) {
        //get user input
        System.out.println("Enter the number of cups");
        int cups = read.nextInt();
        System.out.println("Enter the number of tablespoons");
        int tablespoons = read.nextInt();
        System.out.println("Enter the number of teaspoons");
        int teaspoons = read.nextInt();

        //handle invalid inputs 
        if (teaspoons < 0 || cups < 0 || tablespoons < 0) {
            System.out.println("Invalid baking measure. Cannot have negative units.");
            System.exit(1);
        }
        if (cups == 0 && tablespoons == 0 && teaspoons == 0) {
            System.out.println("Invalid baking measure. At least one unit must be greater than 0.");
            System.exit(1);
        }

        //call prettyPrint method using user input 
        BakingMeasure bakeMeasure = new BakingMeasure(cups, tablespoons, teaspoons);
        bakeMeasure.prettyPrint();
    }

    // asks the user for number of millilitres, creates a MetricVolume object and calls the convert method using the user input
    public static void metricVolumeInput(Scanner read) {
        //get user input
        System.out.println("Enter the number of millilitres");
        int millilitres = read.nextInt();

        //handle invalid inputs
        if (millilitres <= 2) {
            System.out.println("Invalid millilitres. Must be greater than 2.");
            System.exit(1);
        }

        //call convert method using user input
        MetricVolume metVol = new MetricVolume(millilitres);
        System.out.println(millilitres + " millilitres in baking measures is:");
        metVol.convert().prettyPrint();
    }
}