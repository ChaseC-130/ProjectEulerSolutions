package com.company;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Problem2EvenFib {

    public static void problem2() {
        System.out.println(fib());
    }
    static int fib() {
        int a = 0, b = 1, c;
        int sum = 0;
        while (b < 4_000_000) {
            c = a + b;
            if (c % 2 == 0)
                sum += c;
            a = b;
            b = c;
        }
        return sum;
    }
}
