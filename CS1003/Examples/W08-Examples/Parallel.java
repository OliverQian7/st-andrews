
import java.util.stream.*;

class Parallel {

    // We need a method that'll take some time
    // Let's do naive prime-checking
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Again: very minimal error checking and exception handling here, don't do this
    // in real code...
    public static void main(String[] args) throws Exception {
        int largeNumber = Integer.parseInt(args[0]);

        String mode = args[1];
        if (mode.equals("sequential")) {
            IntStream.range(largeNumber, largeNumber + 5000)
                    .filter(n -> isPrime(n))
                    .forEach(n -> System.out.println("Prime: " + n));
        } else if (mode.equals("parallel")) {
            IntStream.range(largeNumber, largeNumber + 5000)
                    .parallel() // the only difference
                    .filter(n -> isPrime(n))
                    .forEach(n -> System.out.println("Prime: " + n));
        }
    }
}
