import java.util.*;

public class Block {
    // Attributes
    private int blockSize;
    private Cell[][] cellArray;
    private Scanner scan;
    private boolean formatValid = true;
    private String formatErrorDescription = null;
    private boolean structureValid = true;
    private String structureErrorDescription = null;

    // Constructor
    public Block(Scanner scan, int blockSize) {
        this.scan = scan;
        this.blockSize = blockSize;
        this.cellArray = new Cell[blockSize][blockSize];
    }

    // Methods
    /**
     * Prompts user to enter in cell values and populates cellArray using those
     * values to create a block. Additionally, checks that the blcok's structure is
     * correct and that all cell values are valid.
     */
    public void initialise() {
        System.out.println("Enter cell values:");
        for (int i = 0; i < blockSize; i++) {
            if (scan.hasNextLine()) {
                String input = scan.nextLine();
                // Checks that each row has correct number of cells
                if (input.split(",").length != blockSize) {
                    if (formatValid) {
                        formatErrorDescription = "Invalid format: number of cells in row.";
                        formatValid = false;
                        // exits for loop
                        i = blockSize;
                    }
                } else {
                    // Checks that each cell value is valid
                    for (int j = 0; j < blockSize; j++) {
                        Cell cell = makeCell(input.split(",")[j]);
                        cellArray[i][j] = cell;
                        if (!cellArray[i][j].validValue()) {
                            if (formatValid) {
                                formatErrorDescription = "Invalid format: value: " + cellArray[i][j].getValue() + ".";
                                formatValid = false;
                                // exits for loops
                                i = blockSize;
                                j = blockSize;
                            }
                        }
                    }
                }
            } else {
                // Throws error if there aren't enough lines
                if (formatValid) {
                    formatErrorDescription = "Invalid format: number of rows.";
                    formatValid = false;
                    // exits for loop
                    i = blockSize;
                }
            }
        }
        // Tells user if format is valid or prints an error if there is one
        if (formatValid) {
            System.out.print("Valid format, ");
            checkStructure();
        }
        else System.out.println(formatErrorDescription);
    }

    // Checks that values are not repeated in any row, column or in the block as a whole.
    public void checkStructure() {
        if (formatValid) {
            int index = 0;
            // creates new 1-D array to hold all cells
            Cell[] cells = new Cell[blockSize * blockSize];
            for (int i = 0; i < blockSize; i++) {
                for (int j = 0; j < blockSize; j++) {
                    // populates new 1-D Cell array
                    cells[index] = cellArray[i][j];
                    index++;
                    for (int k = j + 1; k < blockSize; k++) {
                        // checks if values are repeated in a row
                        if (cellArray[i][j].getValue().equals(cellArray[i][k].getValue())) {
                            if (structureValid) {
                                structureErrorDescription = "invalid structure: " + cellArray[i][j].getValue()
                                        + " repeated in row " + (i + 1) + ".";
                                structureValid = false;
                            }
                        }
                        // checks if values are repeated in a column
                        if (cellArray[j][i].getValue().equals(cellArray[k][i].getValue())) {
                            if (structureValid) {
                                structureErrorDescription = "invalid structure: " + cellArray[j][i].getValue()
                                        + " repeated in column " + (i + 1) + ".";
                                structureValid = false;
                            }
                        }
                    }
                }
            }
            // checks if values are repeated in entire block
            for (int i = 0; i < cells.length; i++) {
                for (int j = i + 1; j < cells.length; j++) {
                    if (cells[i].getValue().equals(cells[j].getValue())) {
                        if (structureValid) {
                            structureErrorDescription = "invalid structure: " + cells[i].getValue()
                                    + " repeated in block.";
                            structureValid = false;
                        }
                    }
                }
            }
            // Tells user if format is valid or prints an error if there is one
            if (structureValid)
                System.out.println("valid structure.");
            else
                System.out.println(structureErrorDescription);
        }
    }

    /**
     * Creates new cell.
     * 
     * @param input the new cell's value
     * @return newly created cell
     */
    public Cell makeCell(String input) {
        Cell cell = new Cell(input);
        return cell;
    }

    /**
     * Changes the blockSize and applies this change to cellArray
     * 
     * @param num the new blockSize
     */
    public void setBlockSize(int num) {
        this.blockSize = num;
        this.cellArray = new Cell[blockSize][blockSize];
    }
}