
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

class Lorem {

    public static void main(String[] args) throws IOException {

        // printing all words from a file
        Files.lines(Paths.get("lorem.txt"))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .forEach(w -> System.out.println(w));

    }
}
