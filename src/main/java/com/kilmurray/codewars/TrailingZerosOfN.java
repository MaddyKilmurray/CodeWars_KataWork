package com.kilmurray.codewars;

public class TrailingZerosOfN {
    public static int zeros(int n) {
        int fact = n;
        int count = 0;
        while (fact > 0) {
            count = count + (fact/5);
            fact = fact/5;
        }
        return count;
    }
}
