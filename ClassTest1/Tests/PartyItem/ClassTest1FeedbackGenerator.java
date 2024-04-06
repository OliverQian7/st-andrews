import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.stream.Collectors;

import feedback.FeedbackGenerator;
import feedback.output.OutputType;

public class ClassTest1FeedbackGenerator {
    public static void main(String[] args) throws FileNotFoundException { 
        System.setIn(null);
        OutputType type = OutputType.PLAIN_TEXT;
        if ( args.length > 0 ) {
            try { type = OutputType.valueOf(args[0].trim().toUpperCase()); }
            catch (Exception e) { 
                System.out.println("Unrecognised output type. Try " + 
                    Arrays.stream(OutputType.values()).map(t -> t.toString()).collect(Collectors.joining(" or ")));
            } 
        }
        PartyItemDescriptor pi = new PartyItemDescriptor();
        FeedbackGenerator feedbackGenerator = new FeedbackGenerator(pi);
        feedbackGenerator.checkClasses(type);
    }
}
