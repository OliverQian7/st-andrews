import java.util.*;

public class TextualBlock extends Block {
    // Constructor
    public TextualBlock(Scanner scan, int blockDimension) {
        super(scan, blockDimension);
    }

    // Methods
    /**
     * Creates new TexualCell instead of Cell.
     * 
     * @param input value of new TextualCell
     * @return newly created TextualCell
     */
    @Override
    public TextualCell makeCell(String input) {
        TextualCell cell = new TextualCell(input);
        return cell;
    }
}