package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here


    Random r = new Random();
    char c = (char) (r.nextInt(26) + 'a');


System.out.println(c);
        if (c == 'a') {
        System.out.print(" A is a vowel");
        } else if (c == 'e') {
        System.out.print("E is a vowel");
        } else if (c == 'i') {
        System.out.print(" I is a vowel");
        } else if (c == 'o') {
        System.out.print("o is a vowel ");
        } else if (c == 'u') {
        System.out.print("u is a vowel");
        }else
        {System.out.print(" Alpabet is not a vowel");
        }
        }}