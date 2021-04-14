package com.company;

public class Problem4LargestPalindrome {

    public static void problem4() {
        int max = 1;
        int num;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j >= i; j--) {
                num = i * j;
                if (isPalindrome(num)) {
                    max = Math.max(max, num);
                }
            }
        }
        System.out.println(max);
    }

    static boolean isPalindrome(int a) {
        String temp = Integer.toString(a);
        int i = 0, j = temp.length()-1;
        while(i < j) {
            if (temp.charAt(i) != temp.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
