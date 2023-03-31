package com.leetCode30Day;

import java.util.ArrayList;
import java.util.List;

public class VersionControl2 {
    public static int firstBadVersion1(int n) {
        boolean firstOddBadVersion;
        boolean lastGoodVersion = true;
        int versions;

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                firstOddBadVersion = isBadVersion(i);

                if(firstOddBadVersion){
                    versions = i;
                    while(lastGoodVersion){
                    versions = versions - 1;
                        lastGoodVersion = isBadVersion(versions);
                    }
                    return versions + 1;
                }
            }
        }
        return n;
    }

     public static int firstBadVersion2(int n) {
         if (n == 1) return n;
         int versions = n;
         int lastBadVersion = n;

         int mid = versions / 2;
         while (isBadVersion(mid)) {
             lastBadVersion = mid;
             mid = mid / 2;
         }

         if (lastBadVersion - mid == 1) return lastBadVersion;
         mid = (((Math.round((lastBadVersion - mid) + 1) / 2)) + mid) - 1;



             return 0;

    }

    private static boolean isBadVersion(int n) {
        List<Number> versions = new ArrayList<>(List.of(2126753390));
        return versions.contains(n);
    }

    public static void main(String[] args) {
        System.out.println(VersionControl2.firstBadVersion1(2126753390));
    }

}
