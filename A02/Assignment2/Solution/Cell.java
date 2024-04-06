public class Cell {
    // Attributes
    private String value;

    // Constructor
    public Cell(String value) {
        this.value = value;
    }

    // Methods
    /**
     * gets the value of a cell
     * 
     * @return the value of a cell
     */
    public String getValue() {
        return value;
    }

    /**
     * Checks a cell's value against all possible values (1-9) for cells to determine
     * whether or not cell's value is valid
     * 
     * @return whether or not the cell's value is valid or not
     */
    public boolean validValue() {
        for (int i = 1; i < 10; i++) {
            String s = Integer.toString(i);
            if (value.trim().equals(s))
                return true;
        }
        return false;
    }

}
