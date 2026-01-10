package day2.practice;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
        System.out.print("Enter the Input Number: ");

        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= num;i++){
            sum = sum + i;

        }
        System.out.println("Sum of first " + num + " natural numbers = " + sum);

        sc.close();


    }
}
