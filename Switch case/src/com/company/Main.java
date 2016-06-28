package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int integer = r.nextInt(26) + 97;
        char Alphabet = (char) integer;
        System.out.println(integer);
        System.out.println(Alphabet);
        switch (Alphabet) {

            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
            default:
                System.out.println("alphaet is not vowel");
                break;
        }
        System.out.println("------------------");

        Random ra = new Random();
        int integerc = ra.nextInt(26) + 65;
        char Alphabetc = (char) integerc;
        System.out.println(integerc);
        System.out.println(Alphabetc);
        switch (Alphabetc) {

            case 'A':
                System.out.println("A is vowel");
                break;
            case 'E':
                System.out.println("E is vowel");
                break;
            case 'I':
                System.out.println("I is vowel");
                break;
            case 'O':
                System.out.println("O is vowel");
                break;
            case 'U':
                System.out.println("U is vowel");
                break;
            default:
                System.out.println("alphaet is not vowel");
                break;


        }
        System.out.println("------------------");

    }
}
