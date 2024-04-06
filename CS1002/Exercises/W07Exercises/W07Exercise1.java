import java.util.Scanner;

public class W07Exercise1 {

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    
        W07Exercise1 exercises = new W07Exercise1();
        exercises.runExercises();
    }
    
    public void runExercises() {

        System.out.println("Enter exercise number:");
        int number = reader.nextInt();
        
    	switch (number) {
    	
    		case(1):
    			exercise1();
    			break;
    		case(2):
    			exercise2();
    			break;
    		case(3):
    			exercise3();
    			break;
    		case(4):
    			exercise4();
    			break;
    		case(5):
    			exercise5();
    			break;
    		case(6):
    			exercise6();
    			break;
    		case(7):
    			exercise7();
    			break;
    		default:
    			System.out.println("unknown exercise");
    	}
    }

    public void exercise1() {
        System.out.println("Enter number of elements: ");
        int num = reader.nextInt(); 
        int[] exercise1array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter element:");
            exercise1array[i] = reader.nextInt();
        }
        System.out.println("Elements:");
        for (int i = 0; i < num; i++){
            System.out.println(exercise1array[i]);
        }
    }

    public void exercise2() {
        int [] exercise2array = getArray();
        System.out.println("Elements:");
        for (int i = 0; i < exercise2array.length; i++){
            System.out.println(exercise2array[i]);
        }
    }

    public void exercise3() {
        int [] exercise3array = getArray();
        int largest = exercise3array[0];
        for (int i=1; i < exercise3array.length - 1; i++) {
            if (exercise3array[i] > largest) 
                largest = exercise3array[i];
        }
        System.out.println("Maximum value:" + largest);
    }

    public void exercise4() {
        int [] exercise4array = getArray();
        int total = 0;
        for (int i=0; i < exercise4array.length; i++) {
            total += exercise4array[i];
        }
        double avg = (double)total/exercise4array.length;
        System.out.println("Mean value:" + avg);
    }

    public void exercise5() {
        int[] exercise5array = getArray();
        System.out.println("Enter element to search for:");
        int num = reader.nextInt();
        int arrIndex = -1;
        for (int i = 0; i < exercise5array.length; i++) {
            if (exercise5array[i]==num) {
                arrIndex = i;
                break;
            }
        }
        System.out.println("First occurrence at index:" + arrIndex);
    }

    public void exercise6() {
        int[] exercise6array = getArray();
        System.out.println("Enter element to search for:");
        int num = reader.nextInt();
        int arrIndex = -1;
        for (int i = exercise6array.length-1; i >= 0; i--) {
            if (exercise6array[i]==num) {
                arrIndex = i;
                break;
            }
        }
        System.out.println("Last occurrence at index:"+arrIndex);        
    }

    public void exercise7() {
        int [][] exercise7array = new int[3][3];
        for (int i=0; i < exercise7array.length; i++) {
            for (int j=0; j < exercise7array[i].length; j++) {
                System.out.println("Enter element ["+i+","+j+"]:");
                exercise7array[i][j] = reader.nextInt();
            }
        }
        System.out.println("Transposed array:");
        for (int i=0; i < exercise7array.length; i++) {
            for (int j=0; j < exercise7array[i].length; j++) {
                System.out.print(exercise7array[j][i] + " ");
            }
            System.out.print("\n");
        }
        
    }

    public int[] getArray() {
        System.out.println("Enter number of elements: ");
        int num = reader.nextInt(); 
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter element:");
            nums[i] = reader.nextInt();
        }
        return nums;
    }
}