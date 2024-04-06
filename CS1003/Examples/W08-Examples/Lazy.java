
import java.util.stream.IntStream;


class Lazy {

    public static void main(String[] args) {

        IntStream numbers = IntStream.range(0, 10);

        numbers.map(n -> { System.out.println(n) ; return n + 1;})
            .limit(4)
            .forEach(n -> System.out.println("final " + n));

    }
}

