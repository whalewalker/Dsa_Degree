package com.algo;

public class NumberOFBits {
    public static int solve(int n) {
//        long bin = Integer.bitCount(n);
//        long count = bin.chars().filter(ch -> ch == '1').count();
//        return (int) count;

        int bits = 0;
        while (n > 0) {
            bits += n & 1;
            n = n >> 1;
        }

        return bits;
    }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
