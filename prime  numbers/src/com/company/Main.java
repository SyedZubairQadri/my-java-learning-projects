package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            char process[] = input.toCharArray();
            boolean status = false;
            int index = 0;
            for (int i = 0; i < process.length; i++) {
                for (int j = 0; j < process.length; j++) {

                    if (i == j) {
                        continue;
                    } else {
                        if (process[i] == process[j]) {
                            status = true;
                            index = i;
                            break;
                        } else {
                            status = false;

                        }
                    }

                }
                if (status) {
                    System.out.print("" + process[i]);

                }
            }

    }
}


