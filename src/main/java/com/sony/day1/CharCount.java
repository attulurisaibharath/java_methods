package com.sony.day1;

public class CharCount {
    public static void main(String[] args) {
        String name ="i am a good boy";
        int vcount=0;
        int ucount=0;
        try{
        for(int i=0;i<=name.length();i++) {
            char ch = name.charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vcount++;
                    break;
                default:
                    ucount++;

            }
            }
            }
        catch(Exception e) {
            System.out.println("THere are:" + vcount);
        }
        }

}
