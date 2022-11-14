import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    List<Person> persons =new ArrayList<>();

    public PersonService(List<Person> personList) {
    this.persons=personList;
    }

    public List<String> allThePersonsNames(){
        List<String> result = new ArrayList<>();

        List<String> personFirstName = persons.stream().map(Person::firstName).toList();
        List<String> personLastName = persons.stream().map(Person::lastName).toList();

        for(int i = 0; i<personFirstName.size();i++){
            result.add(personFirstName.get(i) + " " + personLastName.get(i));
        }

        return result;
    }

    public List<Person> allPersonsThatAreMajor(){
        return persons.stream().filter(person-> person.city().equals("NY")).collect(Collectors.toList());
    }

    public List<Person> allPersonsFromOradea(List<Person> persons){
        return persons.stream().filter(person -> person.city().equals("Oradea")).collect(Collectors.toList());
    }

    public List<Person> allPersonsFromOradeaOrCluj(List<Person> persons){
        return persons.stream().filter(person -> person.city().equals("Oradea")||person.city().equals("Cluj")).collect(Collectors.toList());
    }

    public List<Person> allFirstNameCapitalized(){
        List<Person> result = new ArrayList<>();

        List<String> firstNameList = persons.stream().map(person-> person.firstName().toUpperCase()).toList();
        List<String> lastNameList = persons.stream().map(Person::lastName).toList();
        List<Integer> ageList = persons.stream().map(Person::age).toList();
        List<String> cityList = persons.stream().map(Person::city).toList();

        for(int i = 0; i<persons.size();i++){
            Person person= new Person(firstNameList.get(i), lastNameList.get(i) ,ageList.get(i),cityList.get(i));
            result.add(person);
        }

        return result;
    }

    public List<String> personNames(){
        List<String> result = new ArrayList<>();
        List<String> firstName = persons.stream().map(Person::firstName).toList();
        List<String> secondName = persons.stream().map(Person::lastName).toList();
        for(int i = 0; i<firstName.size();i++){
            result.add(firstName.get(i) + " " + secondName.get(i).charAt(0)+".");
        }
        return result;
    }

    public List<Person> personBetween18and60(){
        return persons.stream().filter(person -> (person.age()>18) && (person.age() <60)).toList();
    }
}
