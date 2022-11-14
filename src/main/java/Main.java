import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Person> personList = List.of(new Person("Maria","Anna",20,"Baia Mare"),
            new Person("Anca","Petru",15,"Satu Mare"),
            new Person("John","Pete",70,"NY"));
    PersonService personService= new PersonService(personList);
        System.out.println(personService.allThePersonsNames());
        System.out.println(personService.allPersonsThatAreMajor());
        System.out.println(personService.allFirstNameCapitalized());
        System.out.println(personService.personNames());
        System.out.println(personService.personBetween18and60());
    }

}
