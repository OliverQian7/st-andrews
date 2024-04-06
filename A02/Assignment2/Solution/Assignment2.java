import java.util.*;

public class Assignment2 {
    // Attributes
    static Scanner read = new Scanner(System.in);
    public static final int NUMERIC_BLOCK_SIZE = 3;
    public static final int TEXTUAL_BLOCK_SIZE = 5;

    public static void main(String args[]) {
        System.out.println("Enter block type:");
        String input = read.nextLine();
        switch (input) {
            case ("n"): numericPuzzle(); break;
            case ("t"): textualPuzzle(); break;
            default: System.out.println("Invalid block type.");
        }
    }

    /**
     * Handles numeric puzzles. Creates new Block and checks for correct format and
     * structure.
     */
    public static void numericPuzzle() {
        Block block = new Block(read, NUMERIC_BLOCK_SIZE);
        block.initialise();
    }

    /**
     * Handles textual puzzles. Creates new TextualBlock and checks for correct
     * format and structure.
     */
    public static void textualPuzzle() {
        TextualBlock block = new TextualBlock(read, TEXTUAL_BLOCK_SIZE);
        block.initialise();
    }
}