package com.dsa;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {200, 132, 54, 114, 154, 65, 4, 9, -111};
        System.out.println(Arrays.toString(arr));
        System.out.println("********** Sorted array *********");
        int count=0;
        for (int gap = arr.length/2; gap>0;gap = gap/2){
            for (int i = gap; i<arr.length;i++){
                int ele = arr[i];
                int j;
                for (j = i; j>=gap && arr[j-gap] > ele; j -= gap){
                    arr[j] = arr[j-gap];
                    count++;
                }
                arr[j] = ele;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("no of parses = "+count);
    }
}
