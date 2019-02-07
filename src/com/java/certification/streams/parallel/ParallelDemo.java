package com.java.certification.streams.parallel;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class ParallelDemo {
    public static void main(String[] args) {
        Instant startedUnordered = Instant.now();

        IntStream.rangeClosed(1,100)
                .forEach(
                        (i)->{
                            System.out.println(String.format("Aufruf von Thread " +
                                    "%s fuer Nummer %s",Thread.currentThread().getName(),
                                    i));
                        }
                );

        System.out.println("Geordnet time: "+ Duration.between(startedUnordered, Instant.now()));

        System.out.println("----------------------------------------");
        Instant startedOrdered = Instant.now();

        IntStream.rangeClosed(1,100)
                .forEachOrdered(
                        (i)->{
                            System.out.println(String.format("Aufruf von Thread " +
                                    "%s fuer Nummer %s",Thread.currentThread().getName(),
                                    i));
                        }
                );

        System.out.println("Geordnet time: "+ Duration.between(startedOrdered, Instant.now()));
    }
}
