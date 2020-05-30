package com.company.zad2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var integers = List.of(1,2,3,4,-5,-6,7,8,9,10);
        var copyOfIntegers = integers.stream().filter(number -> number > 0).collect(Collectors.toUnmodifiableList());
        System.out.println(copyOfIntegers);
        copyOfIntegers.add(7);
    }
}
