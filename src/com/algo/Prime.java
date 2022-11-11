package com.algo;

public class Prime {

    public static boolean isPrime(int num){
        int count = 2;
        while (count <= num / 2){
            if (num % count == 0)
                    return false;
            ++count;
        }
        return true;
    }

    public static boolean isPrimeNumber(int num) {
        int[] factors = {2, 3, 4, 5, 6, 7, 8, 9};
        if (num == 2 || num == 3)
            return true;
        for (int factor : factors) {
            if (num % factor == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("First solution ==> " + isPrime(293));
        System.out.println("Second solution ==> " + isPrimeNumber(293));
    }
}
