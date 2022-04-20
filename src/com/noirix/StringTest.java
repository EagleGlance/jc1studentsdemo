package com.noirix;

public class StringTest {

    public static final String HELLO = "Hello";

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();

        //String s3 = s2.intern();
        String hello = "Hello";

        System.out.println(s1 == s2);
        //System.out.println(s1 == s3);

        System.out.println(hello == "Hello");
        System.out.println(HELLO == "Hello");
        System.out.println(HELLO == hello);
        System.out.println(hello == ("Hel" + "lo"));


    }
}

