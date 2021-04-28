package ocp.tree.travel;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Person> personListFiltered = Stream.of(new Person(1), new Person(1))
                .filter(distinctByKey(Person::getAge))
                .collect(Collectors.toList());
        System.out.println("personListFiltered = " + personListFiltered);
    }


    public static Predicate<Person> distinctByKey(Function<Person, ?> keyExtractor) {
        Set<Object> set = new HashSet<>();
        Predicate<Person> predicate = t -> {
            if (set.contains(keyExtractor.apply(t))) {
                return false;
            } else {
                set.add(keyExtractor.apply(t));
                return true;
            }
        };
        return predicate;

    }
}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}