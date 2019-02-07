package com.java.certification.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTrain {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.of(2016,12,15));

        Period pr1 = Period.of(1,2,7);
        System.out.println(pr1);
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY.MM.DD"));
        System.out.println(date);

        String printdate = LocalDate.parse("2057-08-11").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(printdate);
    }
}
