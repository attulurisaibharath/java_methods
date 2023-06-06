package com.sony.day2;

public class ExamplesOfPrime {
    public static void main(String[] args) {
        System.out.println("this is to check whether a number is prime");
        int num =16;
        if(isPrime(num)){
            System.out.println("It is a prime number");
        }else{
        }
    }
    public static boolean isPrime(int num){
        if((num<2&& num%2==0)){
            return false;
        }for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
}
