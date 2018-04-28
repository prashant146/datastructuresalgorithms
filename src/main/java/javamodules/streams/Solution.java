package javamodules.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {

        Stream.of("A", "B", "C")
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s->s.toUpperCase())
                .filter(s->s.startsWith("A"))
                .forEach(System.out::println);


        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));

        List<Person> filtered = persons.stream()
                .filter(p->p.age>12)
                .collect(Collectors.toList());
        System.out.println(filtered);

        Map<Integer, List<Person>> personByAge = persons.stream()
                .collect(Collectors.groupingBy(p->p.age));
        personByAge.forEach((age, p)->System.out.format("age: %s  %s", age, p));

        Double age = persons.stream()
                .collect(Collectors.averagingInt(t->t.age));
        System.out.println(age);

        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + ";" + name2));

        System.out.println(map);

    }
}
