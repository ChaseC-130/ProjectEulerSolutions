package com.company;

public class Problem6SumSquareDiff {

    public static void problem6() {
        int sumOfSquares = 0, squareOfSums = 0;

        for (int i = 1; i <= 100; i++) {
            squareOfSums += i;
            sumOfSquares += i * i;
        }
        System.out.println(squareOfSums * squareOfSums - sumOfSquares);
    }
}
