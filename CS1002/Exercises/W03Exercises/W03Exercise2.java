import java.util.*;
public class W03Exercise2 {
    public static void main(String[] args) {
        Mug standard = new Mug("Standard", 90, 80);
        Mug small = new Mug("Small", 80, 70);

        Scanner sc = new Scanner(System.in);
        System.out.printf("How many '%s' cups of coffee do you drink per day?%n", standard.getName());
        int numberOfStandard = sc.nextInt();
        System.out.printf("How many '%s' cups of coffee do you drink per day?%n", small.getName());
        int numberOfSmall = sc.nextInt();

        double totalLitres = (double)(standard.getVolume() * (double)numberOfStandard + small.getVolume() * (double)numberOfSmall);

        int totalMallows = (standard.getMarshmallowLimit() * numberOfStandard + small.getMarshmallowLimit() * numberOfSmall);

            System.out.printf("You drink %.3fl of coffee per day. ", totalLitres);
            System.out.printf("If you sweetened all your drinks, you would have %d marshmallows per day.%n", totalMallows);
    }
}