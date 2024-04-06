import java.util.Scanner;

public class W04Exercise1 {

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    
        W04Exercise1 exercises = new W04Exercise1();
        
        exercises.runExercises();
    }
    
    public void runExercises() {
        
        boolean isValid = false;
        if (isValid =true) System.out.println(isValid);

        System.out.println("Enter exercise number:");
        int number = reader.nextInt();
        
        if (number == 1) exercise1();
        else if (number == 2) exercise2();
        else if (number == 3) exercise3();
        else if (number == 4) exercise4();
        else if (number == 5) exercise5();
        else System.out.println("unknown exercise");
    }

    public void exercise1() {
        System.out.println("Enter number:");
        int num = reader.nextInt();
        if (num < 0) {
            System.out.println(num + " is negative");
        }
    }

    public void exercise2() {
        System.out.println("Enter number:");
        int num = reader.nextInt();
        if (num < 0) {
            System.out.println(num + " is negative");
        }
        else System.out.println(num + " is non-negative");
    }

    public void exercise3() {
            System.out.println("Enter number:");
        int num = reader.nextInt();
        if (num < 0) {
            System.out.println(num + " is negative");
        }
        else if (num==0) {
            System.out.println(num + " is zero");
        }
        else System.out.println(num + " is positive");
    }

    public void exercise4() {
       
        // This is needed in order to clean up after the previous test.
        reader.nextLine();
        
        // Add new code here.
         System.out.println("Enter animal:");
         String animal = reader.nextLine();
        switch (animal) {
            case "shark":
                System.out.println("fish");
                break;
            case "whale":
                System.out.println("mammal");
                break;
            case "cat":
                System.out.println("mammal");
                break;
            case "turtle":
                System.out.println("reptile");
                break;
            case "human":
                System.out.println("me");
                break;
            default:
                System.out.println("don't know");
        }
    }

    public void exercise5() {
        
        // This is needed in order to clean up after the previous test.
        reader.nextLine();
        
        // Add new code here.
        System.out.println("Enter string 1:");
        String s1 = reader.nextLine();
        System.out.println("Enter string 2:");
        String s2 = reader.nextLine();
        if (s1.contains(s2)){
            int pos1 = s1.indexOf(s2);
            System.out.println("\"" + s1 + "\" does contain \"" + s2 +"\", starting at position " + pos1);
        }
        else if (s2.contains(s1)){
            int pos2 = s2.indexOf(s1);
            System.out.println("\"" + s2 + "\" does contain \"" + s1 +"\", starting at position " + pos2);
        }
        else System.out.println("\"" + s1 + "\"" + " does not contain" + " \"" + s2 + "\"");
    }
}