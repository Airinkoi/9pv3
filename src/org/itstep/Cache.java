package org.itstep;

public class Cache {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        String s1 = "Hello World";
        String s2 = "Hello " + "World";
        System.out.println(s1 == s2);
    }
}