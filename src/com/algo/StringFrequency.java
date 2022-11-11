package com.algo;

import java.util.Scanner;

public class StringFrequency {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /* Input all the text in single line*/
        System.out.print("Enter poem : ");
        String s = in.nextLine();
        /* Split all the letters*/
        String[] input = s.split("");
        /* Hash table for all the alphabetical letters only*/
        int[] hash = new int[200];
        int[] pos = new int[200];
        for(int i = 0;i < 200;i++){
            hash[i] = 0;
            pos[i] = i;
        }
        /* Hashing there value in the hash table*/
        for (String value : input) {
            int j = value.charAt(0);
            if ((j >= 65 && j <= 90) || (j >= 97 && j <= 122)) {
                hash[j]++;
            }
        }
        /* Insertion sort on the hash table*/
        int i;
        for (int j = 1; j < 200; j++){
            int key = hash[ j ];
            int po = pos[j];
            for(i = j - 1; (i >= 0) && (hash[ i ] < key); i--){
                hash[ i+1 ] = hash[ i ];
                pos[i+1] = pos[i];
            }
            hash[ i+1 ] = key;
            pos[i+1] = po;
        }
        /* Printing the value*/
        System.out.print("Most frequent is:");
        System.out.print((char)pos[0]);
        for(i = 1;i < 11;i++){
            System.out.print("-"+(char)pos[i]);
        }

    }
}


