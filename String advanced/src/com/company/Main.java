package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
	String x= "James Dane";
        System.out.println("hello " + x);
        System.out.println(x.toUpperCase());
        System.out.println(x.substring(2));
        System.out.println(x.substring(2,7));
        System.out.println(x.substring(5,10));


        String age = "22";
        String salary = "2.25";

        int a = Integer.parseInt(age) + 2; // for simple integers
        System.out.println(a);

        Double s = Double.parseDouble(salary) * .2; // for decimal numbers
        System.out.println(s);
    }












}
