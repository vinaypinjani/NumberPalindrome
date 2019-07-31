package com.vinaypinjani;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(666));
        System.out.println(isPalindrome(-666));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(-336));
    }

    public static boolean isPalindrome(int number) {
        int stoNum = number;
        int reverse = 0;
        int lsf = number % 10;

        if (number >= 0) {
            while (number >= 1) {
                reverse += lsf;
                reverse *= 10;
                number /= 10;
                lsf = number % 10;
            }
        } else {
            while (number <= -1) {
                reverse += lsf;
                reverse *= 10;
                number /= 10;
                lsf = number % 10;
            }

        }

        return (stoNum * 10) == reverse;

    }
}
