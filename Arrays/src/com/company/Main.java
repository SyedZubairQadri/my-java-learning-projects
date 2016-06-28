package com.company;

public class Main {
    //arrays
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(a[0] + + a[1]);

        for(int temp : a){
            System.out.println(temp);

    }
        System.out.println("========");
int[] x = new  int [5];


        x[3]=25;
        x[0]=12;
        for (int temp0 :x){
            System.out.println(temp0);
            System.out.println("========");
        }
//string arrays
    String[] b ={"one,two,three"};
        for (String temp:b){
            System.out.println(temp);
            System.out.println("========");
        }

            String[] c = new String[3];
            c[0]="1";
            c[1]="2";
            c[2]="2";


            for (String temp2 :c){
                System.out.println(temp2);
            }



        }








    }

