import java.util.Scanner;

public class W05Exercise1 {

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    
        W05Exercise1 exercises = new W05Exercise1();
        
        exercises.runExercises();
    }
    
    public void runExercises() {

        System.out.println("Enter exercise number:");
        int number = reader.nextInt();
        
        switch(number) {
        	case 1: exercise1(); break;
            case 2: exercise2(); break;
            case 3: exercise3(); break;
            case 4: exercise4(); break;
            case 5: exercise5(); break;
            case 6: exercise6(); break;
            case 7: exercise7(); break;
            case 8: exercise8(); break;
            case 9: exercise9(); break;
            case 10: exercise10(); break;
            case 11: exercise11(); break;
        	default: System.out.println("unknown exercise");
        }
    }

    public void exercise1() {
        System.out.println("Enter upper bound:");
        int num = reader.nextInt();
        for (int i = 0; i < num; i++){
            System.out.print((i+1)+" ");
        }
    }

    public void exercise2() {
        System.out.println("Enter upper bound:");
        int num = reader.nextInt();
        int i = 0;
        while (i < num) {
            System.out.print((i+1)+" ");
            i++;
        }
    }

    public void exercise3() {
        System.out.println("Enter lower bound:");
        int lowBound = reader.nextInt();
        System.out.println("Enter upper bound:");
        int upBound = reader.nextInt();
        for (int i = lowBound; i <= upBound; i++){
            System.out.print(i + ", ");
        }
    }

    public void exercise4() {
        System.out.println("Enter lower bound:");
        int lowBound = reader.nextInt();
        System.out.println("Enter upper bound:");
        int upBound = reader.nextInt();
        for (int i = lowBound; i <= upBound; i++){
            if (i%2==0) {
            System.out.print(i + ", ");
            }
        }
    }

    public void exercise5() {
        System.out.println("Enter lower bound:");
        int lowBound = reader.nextInt();
        System.out.println("Enter upper bound:");
        int upBound = reader.nextInt();
        for (int i = lowBound; i <= upBound; i++){
            if (i%10==0) {
            System.out.print(i + ", ");
            }
        }    
    }

    public void exercise6() {
        System.out.println("Enter lower bound:");
        int lowBound = reader.nextInt();
        System.out.println("Enter upper bound:");
        int upBound = reader.nextInt();
        for (int i = upBound; i >= lowBound; i-=3){
            System.out.print(i + ", ");
        }
    }

    public void exercise7() {
        System.out.println("Enter sequence length:");
        int length = reader.nextInt();
        for (int i = 0; i < length; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("x");
            }
            if (i<length-1) System.out.print(", ");
        }
    }

    public void exercise8() {
        System.out.println("Enter number:");
        int num = reader.nextInt();
        while (num != -1) {
            System.out.println(2*num);
            System.out.println("Enter number:");
            num = reader.nextInt();
        }
    }

    public void exercise9() {
        System.out.println("Enter string:"); 
        String input = reader.next();
        while (!input.equals("quit")) {
            System.out.println(input.length());
            System.out.println("Enter string:");
            input = reader.next();
        }
    }

    public void exercise10() {
        System.out.println("Enter name:");
        String name = reader.next();
        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }

    public void exercise11() {
        System.out.println("Enter number:");
        int num = reader.nextInt();
        for (int i = 0; i< num; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = num-1; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}