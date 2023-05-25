package com.sony;

public class MethodExamples {
    int num = 13;

    public static void main(String[] args) {
        System.out.println("Method examples");
        System.out.println("done..");
        int n=10;
        for(int i=0;i<=n;i++){
            if(isEven(i)){
                System.out.println(i);
            }

        }

    }


        public static boolean isEven ( int num){

            if (num % 2 == 0) {
                return true;
            } else {
                return false;
            }


        }

}
