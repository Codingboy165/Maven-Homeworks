import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Maria", "Anna", 20, "Baia Mare"),
                new Person("Anca", "Petru", 15, "Satu Mare"),
                new Person("John", "Pete", 70, "NY"),
                new Person("Anca", "Petru", 30, "Oradea"));
        PersonService personService = new PersonService(personList);
        System.out.println(personService.allThePersonsNames());
        System.out.println(personService.allPersonsThatAreMajor());
        System.out.println(personService.allFirstNameCapitalized());
        System.out.println(personService.personNames());
        System.out.println(personService.personBetween18and60());
        System.out.println(personService.personsHavingFirstNameStartingWithA());
        System.out.println(personService.firstNameUnique());
        System.out.println(personService.sortByFirstName());
        System.out.println(personService.personsHavingFirstNameStartingWithA());
        System.out.println(personService.multypleSort());
        System.out.println(personService.allPersonsFromOradeaOrCluj());
        System.out.println(personService.allPersonsFromOradea());
        System.out.println(personService.sortByLastName());
    }

}
