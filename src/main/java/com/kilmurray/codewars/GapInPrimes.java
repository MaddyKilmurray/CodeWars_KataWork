package com.kilmurray.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;
//
//The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. From 3 to 5 the gap is 2. From 7 to 11 it is 4. Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43
//
//        A prime gap of length n is a run of n-1 consecutive composite numbers between two successive primes (see: http://mathworld.wolfram.com/PrimeGaps.html).
//
//        We will write a function gap with parameters:
//
//        g (integer >= 2) which indicates the gap we are looking for
//
//        m (integer > 2) which gives the start of the search (m inclusive)
//
//        n (integer >= m) which gives the end of the search (n inclusive)
//
//        n won't go beyond 1100000.
//
//        In the example above gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5} which is the first pair between 3 and 50 with a 2-gap.
//
//        So this function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n if these numbers exist otherwise `nil or null or None or Nothing (or ... depending on the language).

// Solved, but too inefficient. Will try again 19/08/2021

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        List<Long> primes = new ArrayList<>();
        long[] results = new long[2];
        int count = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        while (count < (primes.size() - 1)) {
            if (primes.size() > 2 && (primes.get(count + 1) - primes.get(count) == g)) {
                results[0] = primes.get(count);
                results[1] = primes.get(count + 1);
                return results;
            }
            if (primes.size() >= 2) {
                count++;
            }
        }
        return null;
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
