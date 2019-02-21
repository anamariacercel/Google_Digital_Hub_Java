package com.threesum;
import java.util.*;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String []args) {
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();

        int[] anArray;
        anArray = new int[n];

        for (int i = 0; i < n; i++) {
            anArray[i] = S.nextInt();
        }

        Arrays.sort(anArray);
        int nr=0;
        for(int i=0; i<n-2;i++)
        {
            int sum=0-anArray[i];
            int start=i+1;
            int end=n-1;

            while(start<end)
                if(anArray[start]+anArray[end]==sum)
                {
                    nr++;
                    start++;
                    end--;
                }
                else if(anArray[start]+anArray[end]>sum)
                    end--;
                else
                    start++;
        }

        System.out.println("Number of pairs is: "+nr);
    }
}
