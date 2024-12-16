import java.util.*;


public class Main {

    public static void main(String[] args) {
        Job engineer = new Job("engineer", 5000);
        Job architect = new Job("architect", 4500);
        Job programmer = new Job("programmer", 8500);
        Job quant = new Job("quant", 10000);

        Person hans = new Person("Hans",180,engineer);
        Person paul = new Person("Paul",170,architect);
        Person uwe = new Person("Uwe",175,programmer);
        Person flo = new Person("Flo",175,quant);
        Person steffi = new Person("Steffi",160,programmer);

        List<Person> people = new ArrayList<Person>();
        people.add(hans);
        people.add(paul);
        people.add(uwe);
        people.add(flo);
        people.add(steffi);

        Collections.sort(people);

        for (Person person : people) {
            person.print();
        }

    }
}
