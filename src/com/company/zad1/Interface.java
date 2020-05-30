package com.company.zad1;

import java.util.List;
import java.util.Optional;

public interface Interface {
    private List<Integer> getIntegers(){
        return List.of(-1,-2,-3,-4,-5,10,12,15);
    }
    default void getFirstPositive(){
        Optional<Integer> firstPositive = getIntegers().stream().filter(number -> number > 0).findFirst();
        if(firstPositive.isPresent()) System.out.println(firstPositive);
    }
}
