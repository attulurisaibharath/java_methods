package com.sony.day1;

import java.util.Scanner;

public class CalcSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter a choice from 1 to 5");
        int ch = sc.nextInt();
        int res=0;
        String operator="";
        switch(ch){
            case 1:operator="+";
            res=num1+num2;
            break;
            case 2:operator="-";
                res=num1-num2;
                break;
            case 3:operator="*";
                res=num1*num2;
                break;
            case 4:operator="%";
                res=num1%num2;
                break;
            case 5:
                System.exit(0);
            default:
                operator="Invalid operator";



        }
        System.out.println(num1+""+operator+""+num2+"="+res);
    }
}
