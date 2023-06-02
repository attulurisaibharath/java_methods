package com.sony.day1;

import java.util.Scanner;

public class CalcBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day name as mon,tue,wed,thurs,fri,sat ,sun");
        String dayname= sc.nextLine();
        System.out.println("enter the bill amount:");
        float billamount= sc.nextFloat();
        float discount=0;
        float netamount=0;
        switch(dayname){
            case "mon":
            case "tue":
            case "wed":
                discount=billamount*0.5f;
                break;
            case "thurs":
            case "fri":
                discount=billamount*0.1f;
                break;
            case "sat":
            case "sun":
                discount=-billamount*0.1f;
                break;
        }
        netamount=billamount-discount;
        System.out.println(netamount);
    }
}
