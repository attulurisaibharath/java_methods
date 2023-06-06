package com.sony.day3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gnum = ThreadLocalRandom.current().nextInt(1, 7);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess a number babe:");
            int ch = sc.nextInt();
            if (gnum == ch) {
                System.out.println("The number is correct");
            } else {
                System.out.println("Your guess is wrong" );
                if(i==3){
                    System.out.println("You have reached maximum number of attempts babe:"+gnum);
                }

            }
        }
    }
}
