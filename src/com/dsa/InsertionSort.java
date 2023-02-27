package com.dsa;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {200,132,54,114,154,65,4,9,-111};
        System.out.println(Arrays.toString(arr));
        System.out.println("********** Sorted array *********");
        for (int i=1;i<arr.length;i++){
            int newEle = arr[i];
            int j;
            for (j = i;j>0 && arr[j-1] > newEle;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = newEle;
        }

        System.out.println(Arrays.toString(arr));

    }
}
