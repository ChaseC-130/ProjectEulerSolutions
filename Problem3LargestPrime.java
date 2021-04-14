package com.company;

import java.util.LinkedList;

public class Problem3LargestPrime {

    public static void problem3() {

        long num = 600851475143L;
        double top = Math.sqrt(num);

        boolean flag = true;
        LinkedList<Integer> list = new LinkedList();
        for (int i = 2; i < (int)top; i++) {
            flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % 2 == 0 || i % 3 == 0) {
                    flag = false;
                    break;
                }
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                list.add(i);
        }


        for (int i = list.size(); i-- > 0;) {
            if (num % list.get(i) == 0)
                System.out.println(list.get(i));
        }

    }
}
