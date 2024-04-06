import cs1002.people.*; //so we can create Person and MultiPersonDisplay objects
import java.awt.Color; //so we can use colors if we want to

public class W01Exercise2 {
    public static void main(String[] args) {

        Color keyboardSmash = new Color (140,25,87);
        //TODO: Change the parameter values to match your own name, height & date of birth
        //create a Person object with name Bob, height 165cm, and birthday 1st January 2000
        Person person = new Person("Oliver", 500, 2003, 12, 31);

        //TODO: Add some clothes to your person
        person.wearGloves(Color.CYAN);
        person.wearShoes(Color.ORANGE, Color.YELLOW);
        person.wearTop(Color.RED);
        person.wearBlueTrousers();

        Person person2 = new Person("LeBron", 206, 1984, 12, 30);
        person2.wearShoes(Color.ORANGE);
        person2.wearTop(Color.YELLOW);
        person2.wearTrousers(Color.YELLOW);
        person2.wearShoes(keyboardSmash);

        //display the person
        MultiPersonDisplay displayer = new MultiPersonDisplay(true);
        displayer.add(person);
        displayer.add(person2);
    }
}