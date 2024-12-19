package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad2 {
    public static void main(String[] args) {

        List<Integer> liczby = Arrays.asList(3, 10, 9, 4);

        List<Integer> wynik = liczby.stream()
                .map(n -> n * n + 9)
                .filter(n -> !String.valueOf(n).contains("9"))
                .collect(Collectors.toList());

        System.out.println(wynik);
    }
}
