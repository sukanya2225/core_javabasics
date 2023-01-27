package com.corejava.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num = sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++) {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println(num +" "+ "is prime number");
        }
        else {
            System.out.println(num + "is not a prime");
        }
        System.out.println("anusha");
    }

}
