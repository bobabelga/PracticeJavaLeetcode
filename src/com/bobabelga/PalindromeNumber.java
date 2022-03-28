package com.bobabelga;

public class PalindromeNumber {
    static int  y = 0;
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        int y = 0;
        while(x != 0){
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return temp == y;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
//        System.out.println(isPalindrome(-121));
//        System.out.println(isPalindrome(113));
//        System.out.println(isPalindrome(0));
    }
}
