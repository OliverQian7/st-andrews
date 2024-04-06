import javax.json.*;
import javax.json.stream.*;
import java.io.*;
import java.math.BigDecimal;

public class JsonTotalPrice {
    public static void main( String args[]) throws Exception {
        // We will create a JsonParser object
        // Ignore the factory pattern, it is simply a way of creating a new object
        // We will initialise this parser with a FileReader object, like we 
        // would do with a BufferedReader
        JsonParserFactory factory = Json.createParserFactory(null);
        Reader r = new FileReader( args[0]); 
        JsonParser parser = factory.createParser(r);

        // Initialise the running total to zero
        double total = 0.0;
        
        // Now go through the JSON file one "event" at a time
        // And "event" is simply an occurrence of a valid JSON token
        // e.g. "{" or "}" or, a field name or a value
        while (parser.hasNext()) {
            // Get the next event
            JsonParser.Event e = parser.next();

            // We are only interested in key-value pairs, 
            // ignore everything else
            if (e == JsonParser.Event.KEY_NAME) {
                // This is a key (JSON field name), so get the name of this key
                String name = parser.getString();
        
                // We are only interested in "price" keys, ignore everything else
                if (name.equals("price")) { 
                    // Get the next event -- since this is a valid JSON file,
                    // a key should be followed by a value
                    e = parser.next();
                
                    // Check that it is a number, and if it is, 
                    // add it to the total
                    if (e == JsonParser.Event.VALUE_NUMBER) 
                        // ensure that the parser gives us a number, not a string
                        total += parser.getBigDecimal().doubleValue();
                } 
            }
        }
        System.out.println("Total price: "+total);
    }
}
