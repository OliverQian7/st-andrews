
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Lambda {

    public static void main(String[] args) {

        Person alice = new Person("alice", 21);
        Person bob = new Person("bob", 25);
        Person chris = new Person("chris", 23);

        List<Person> people = new ArrayList<Person>(Arrays.asList(alice, bob, chris));

        // with loops
        // int totalAge = 0;
        // for (Person p : people) {
        //     totalAge += p.getAge();
        // }

        // Stream<Person> peopleStream = people.stream();
        // IntStream agesStream = peopleStream.mapToInt(p -> p.getAge());
        // IntStream filteredAgesStream = agesStream.filter(age -> age > 21);
        // int totalAge = filteredAgesStream.sum();

        int totalAge = people.stream()
                .mapToInt(p -> p.getAge())
                .filter(age -> age > 21)
                .map(age -> {
                    System.out.println(age); // optional, only here for debugging
                    return age;
                })
                .sum();

        System.out.println(people);
        System.out.println(totalAge);
    }
}
