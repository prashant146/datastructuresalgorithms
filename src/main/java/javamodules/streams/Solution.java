package javamodules.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

        List<String> list = Arrays.asList("Apple", "Apple", "Apple", "Banana", "Banana", "Peach", "Pineapple");


        Map<String, Long> out = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(out);
        for(Map.Entry<String, Long> entry : out.entrySet()){
            System.out.println("Key: "+entry.getKey()+"---Value:"+entry.getValue());
        }
        System.out.println("--------------------");
        Stream.of(2, 3, 1, 5, 6, 8)
                .reduce((a,b)->a+b)
                .ifPresent(System.out::println);

        List<Fruit> fruits = Arrays.asList(new Fruit("Apple", 10, new BigDecimal(1.2)),
                new Fruit("Apple",     10, new BigDecimal(1.2)),
                new Fruit("Banana",    10, new BigDecimal(1.2)),
                new Fruit("Apple",     10, new BigDecimal(1.2)),
                new Fruit("Apple",     11, new BigDecimal(1.2)),
                new Fruit("Apple",     12, new BigDecimal(1.2)),
                new Fruit("Pineapple", 12, new BigDecimal(1.2)),
                new Fruit("Banana",    16, new BigDecimal(1.2)),
                new Fruit("Apple",     17, new BigDecimal(1.2)));

        Map map =fruits.stream()
                .collect(Collectors.groupingBy(t->t.quantity));
        System.out.println(map);

        Map map1 =fruits.stream()
                .collect(Collectors.groupingBy(t->t.getQuantity(), Collectors.counting()));
        System.out.println(map1);

        Map<String, Integer> map2 =fruits.stream()
                .collect(Collectors.groupingBy(t->t.getName(), Collectors.summingInt(t->t.getQuantity())));
        System.out.println(map2);


        Solution solution =new Solution();




    }



}
