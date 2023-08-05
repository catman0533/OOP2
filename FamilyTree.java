import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;



class FamilyTree implements Iterable<Person> , Serializable{
    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person getPerson(int index) {
        return people.get(index);
    }

    public List<Person> getPeople() {
        return people;
    }

    public void sortByName() {
        people.sort(Comparator.comparing(Person::getName));
    }

    public void sortByBirthDate() {
        people.sort(Comparator.comparing(Person::getBirthDate));
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }
}
