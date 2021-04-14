package com.company;

public class Problem5SmallestMultiple {

    public static void problem5() {
        int MAX = Integer.MAX_VALUE;
        long val = 1;
        boolean flag = false;

        for (int i = 20; i < MAX; i+=20) {
            flag = true;
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0)
                    flag = false;

            }
            if (flag) {
                System.out.println(i);
                return;
            }
        }
    }
}
