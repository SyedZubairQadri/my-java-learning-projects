package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random rm = new Random(10);
        int v = rm.nextInt(10*1000/100);
        Scanner z = new Scanner(System.in);
        int triesleft= 2;
        int life = 0;
        boolean x = false;

        while (life < 3) {
            System.out.println("Wana Play ? Give Us Your Lucky Number Number : ");
            int i = z.nextInt();


            if (v == i) {
                System.out.println( "You Won" );
                break;

            } else{
                System.out.println(" Number Not Matched Try Again");
                System.out.println( " Tries Left "+  triesleft-- );
                System.out.println(" \n Press Y To Continue ");
                String i2 = z.next("y");
                life++;
            }
         if (life==0 )  {
             String i3 = z.next("y");
             System.out.println
                 ("Sorry Game Over");}
        }
    }
    }