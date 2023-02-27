package com.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {200,132,54,114,154,65,4,9,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("********** Sorted array *********");

        int lastIndex = arr.length-1;
        int temp;
        while(lastIndex != 0 ){
            int largestIndex = 0;
            for (int i=1;i<=lastIndex;i++){
                if (arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }
            }
            temp = arr[lastIndex];
            arr[lastIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
            lastIndex--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
