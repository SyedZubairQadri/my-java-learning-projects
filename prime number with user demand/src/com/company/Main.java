package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int check = 1;
        int i = 0;
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        int a[] = new int[num];
        while (i < num)
            for (int j = 1; i < num; j++) {
                for (int k = 2; k < j; k++)
                    if (j % k == 0)
                        check = 0;
                if (check == 1) {
                    a[i] = j;
                    i++;}
                    check = 1;
                }
                for (int y = 0; y < num; y++) {
                    System.out.println(a[y]);

                }
            }
    }

