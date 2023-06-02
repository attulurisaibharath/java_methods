package com.sony.day1;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        String dayname="";
        switch(num) {
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "wednesday";
                break;
            case 4:
                dayname = "Thursday";
                break;
            case 5:
                dayname = "friday";
                break;
            case 6:
                dayname = "saturday";
                break;
            default:
                dayname = "Monday";
                break;
        }
        System.out.println(dayname);

    }
}
