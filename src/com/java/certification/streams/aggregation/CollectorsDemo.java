package com.java.certification.streams.aggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Person> persons = PersonUtil.getPersonList();

        Person[] personArray = persons.stream()
                .filter(p->p.getFirstname().startsWith("M"))
                .toArray(Person[]::new);

        System.out.println(Arrays.toString(personArray));

        List<Person> personList = persons.stream()
                .filter(p-> p.getFirstname().startsWith("C"))
                .collect(Collectors.toCollection(ArrayList::new));

        for(Person p : personList) System.out.println(p);

        persons.stream()
                .filter(p->p.getFirstname().startsWith("H"))
                .forEach(System.out::println);

        List<Person> personList1 = persons.stream()
                .filter(p->p.getId()>2)
                .collect(Collectors.toList());

        for(Person p : personList1) System.out.println(p);
    }
}
