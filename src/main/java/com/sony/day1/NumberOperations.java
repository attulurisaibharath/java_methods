package com.sony.day1;

public class NumberOperations {
    public static void main(String[] args) {
        int num=98789;
        int reversenum= reverse(num);
        System.out.println(reversenum);
        if(isPalindrome(num)){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not a palindrome");
        }

    }
    private static int reverse(int num) {
        int rev = 0;
        while (num != 0) {

            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        return rev;
    }

    private static boolean isPalindrome(int num){
        return reverse(num) == num;

    }


}
