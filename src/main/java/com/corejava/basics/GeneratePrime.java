package com.corejava.basics;

import java.util.Scanner;

public class GeneratePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower boundary");
        int lb = sc.nextInt();
        System.out.println("enter the upper boundary");
        int ub = sc.nextInt();
        for (int i = lb; i <= ub; i++) {
            System.out.println(isPrime(i));
        }
    }

    public static int isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " "+ "is a prime number");
        }
       return num;
    }
}

