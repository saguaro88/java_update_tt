package com.company.zad3;

public class Main {
    public static void main(String[] args) {
        String empty = "";
        String text = "text";
        String space = " ";
        String AB = "AB\nAB\nAB";
        String DB = " DB ";
        String a = "==";
        System.out.println("isBlank()");
        System.out.println(empty.isBlank());
        System.out.println(text.isBlank());
        System.out.println(space.isBlank());
        System.out.println("isEmpty()");
        System.out.println(empty.isEmpty());
        System.out.println(text.isEmpty());
        System.out.println(space.isEmpty());
        System.out.println("lines");
        System.out.println(AB.lines().findFirst());
        System.out.println(AB.lines().count());
        System.out.println("strip");
        System.out.println(DB);
        System.out.println(DB.strip());
        System.out.println(DB.stripLeading());
        System.out.println(DB.stripTrailing());
        System.out.println("repeat");
        System.out.println(a.repeat(5));


    }
}
