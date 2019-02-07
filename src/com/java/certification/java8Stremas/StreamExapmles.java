package com.java.certification.java8Stremas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExapmles {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Adil",35,"Almanya"),
                new Employee("Mehmet",32,"Ingiltere"),
                new Employee("Hans", 25,"Almanya"),
                new Employee("Kemal",36,"Turkiye")));

        employees.stream().filter(u -> u.getAge()>=35 && u.getCountry().equals("Almanya") && !u.getName().isEmpty()).forEach(System.out::println);
        employees.stream().filter(u -> u.getAge()>=35 && u.getCountry().equals("Almanya") && !u.getName().isEmpty()).findFirst().ifPresent(System.out::println);

        Arrays.stream(new int[]{2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        List<String> people = Arrays.asList("Al", "Ankit","Brent","Sam");
        people.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);

        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands.sorted()
                .filter(x->x.length()>13)
                .forEach(System.out::println);
        bands.close();

    }
}
