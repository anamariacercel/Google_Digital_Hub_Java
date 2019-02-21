package com.twosum;

import java.util.*;
import java.util.Arrays;

public class TwoSum
{
    public static void main(String []args)
    {
        int a;
        Scanner S = new Scanner(System.in);
        a = S.nextInt();

        int []anArray;
        anArray=new int[a];

        for(int i = 0;i<a;i++) {
            anArray[i] = S.nextInt();
        }

        Arrays.sort(anArray);
        int i=0;
        int j=a-1;
        int sum=0;
        while(i<=j)
        {
            if(i==j && anArray[i]==0) {
                break;
            }
            if(i!=0)
                if(anArray[i]==anArray[i-1])
                    i++;
            if(anArray[i]==0 && anArray[j]==0)
            {
               sum++;
                i++;
                j--;
            }
            else
            if(anArray[i]+anArray[j]==0)
            {
                sum++;
                i++;
                j--;
            }
            else
            if(anArray[i]+anArray[j]>0)
                j--;
            else
                i++;

        }

        System.out.println("Number of pairs is: "+sum);


    }
}

