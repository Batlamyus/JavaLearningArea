package com.java.certification.streams.aggregation;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AggregationDemo {

    public static void main(String[] args)
    {
        List<Person> persons = PersonUtil.getPersonList();

        persons.stream()
                .max((p1,p2) -> p2.getId() -p1.getId())
                .ifPresent(System.out::println);

        IntStream.rangeClosed(1,10)
                .map((i) -> Double.valueOf(Math.random()*100).intValue())
                .max()
                .ifPresent((i) -> System.out.println("En büyük olusturulmus Sayi: "+ i));

        String countries = persons.stream().map(Person::getCountry).distinct().collect(Collectors.joining(", "));
        System.out.println("länder" + countries);

        persons.stream().sorted().forEach(System.out::println
        );

        System.out.println("Anzahl der personen: " + persons.stream().count());

        persons
                .stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.counting()))
                .forEach((country, count)-> System.out.println(String.format("Land %s | Anzahl: %s", country, count)));

        persons.stream()
                .collect(Collectors.groupingBy(Person::getCountry, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(e-> e.getValue().intValue())).ifPresent(
                        biggestCountry -> persons.stream()
                .filter(person -> person.getCountry()
                .equals(biggestCountry.getKey()))
                .forEach(System.out::println)
        );

    }

}
