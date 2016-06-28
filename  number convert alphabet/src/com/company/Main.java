package com.company;

import java.util.Scanner;

public class Main {
 public static void main(String[] args){

      String[] num = new String[]{"one", "two", "three", "four", "five","six","seven","eight","nine",""};
      String[] num1 = new String[]{"eleven","Twelve","Thirtheen","Fourteen","Fiftheen","Sixtheen", "Seventeen","eighteen","nintheen",""};
      String[] num2 = new String[]{"ten","Twenty","Thirthy","Fourty","Fifty","Sixty", "Seventy","eighty","ninthy",};

      Scanner src = new Scanner(System.in);
      int input = src.nextInt();
     System.out.println("enter number ");
     if (input < 9) {
         System.out.println(num[1]);

     }
else if (input%10==0){
         System.out.println();

}}}






















