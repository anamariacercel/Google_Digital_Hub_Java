package com.collentions;

import java.util.Arrays;

public class ZigZag {
    static int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};

    static void zigZag()
    {

        boolean flag = true;

        int temp;

        for (int i=0; i<=arr.length-2; i++)
        {
            if (flag)
            {
                if (arr[i] > arr[i+1])
                {

                    temp  = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
            else
            {

                if (arr[i] < arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }
    }

    public static void main(String[] args)
    {
        zigZag();
        System.out.println(Arrays.toString(arr));
    }
}
