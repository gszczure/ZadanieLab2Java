package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad3 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("aa", "cy", "b", "yycd", "c");

        List<String> wynik = strings.stream()
                .map(n -> n + "y")
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());

        System.out.println(wynik);
    }
}
