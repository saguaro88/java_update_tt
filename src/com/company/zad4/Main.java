package com.company.zad4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
    Path path1 = Files.writeString(Files.createTempFile("first",".txt"),"Example text");
    Path path2 = Files.writeString(Files.createTempFile("second",".txt"),"Example text");
    Path path3 = Files.writeString(Files.createTempFile("third",".txt"),"Example text2");

    System.out.println("Pliki takie same");
    System.out.println(Files.mismatch(path1, path2));
    System.out.println(Files.readString(path1));
    System.out.println(Files.readString(path2));
    System.out.println("Pliki rozne");
    System.out.println(Files.mismatch(path1, path3));
    System.out.println(Files.readString(path1));
    System.out.println(Files.readString(path3));

    }
    }
