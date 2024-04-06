public class TextualCell extends Cell {
    // Constructor
    public TextualCell(String value) {
        super(value);
    }

    // Methods
    /**
     * Checks that TextualCell's value matches a possible value for a TextualCell
     * (A-Y) and determines whether or not the value is valid
     * 
     * @return whether or not the TextualCell's value is valid or not
     */
    @Override
    public boolean validValue() {
        for (int i = 65; i < 90; i++) {
            char c = (char) i;
            String s = String.valueOf(c);
            if (getValue().trim().equals(s))
                return true;
        }
        return false;
    }
}
