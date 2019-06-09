import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(String name, String number) {
        persons.add(new Person(name, number));
    }

    public void printAll() {
        for (Person asd : persons) {
            System.out.println(asd);
        }
    }

    public String searchNumber(String name) {
        for (Person asd : persons) {
            if (asd.getName().contains(name))
                return asd.getNumber();
        }
        return "number not known";
    }
}
