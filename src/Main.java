import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]){

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "A", "BLR", "560036", true));
        people.add(new Person(2, "B", "BLR", "560036", false));
        people.add(new Person(3, "C", "BOM", "400004", false));
        people.add(new Person(4, "D", "BOM", "400004", false));
        people.add(new Person(5, "E", "KOL", "700002", true));

        Map<Boolean, Map<String, Set<String>>> groupingByCity = people.stream()
                                                        .collect(Collectors.partitioningBy(Person::isVip ,Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getName, Collectors.toSet()))));

        System.out.println(groupingByCity);



    }
}
