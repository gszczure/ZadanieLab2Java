package org.example;

import java.util.Arrays;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {

        List<Integer> liczby = Arrays.asList(45, 39, 17, 25, 10, 4);

        double srednia = liczby.stream()
                .filter(n -> n % 10 != 9 && n % 10 != 7)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Średnia: " + srednia);
    }
}