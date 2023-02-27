package com.dsa;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4,8,10,7,6,6,1,5,9,3};
        System.out.println(Arrays.toString(arr));
        System.out.println("********** Sorted array *********");
        countSort(arr,1,10);
        System.out.println(Arrays.toString(arr));

    }
    public static void countSort(int[] arr,int min,int max){
        int[] countArr = new int[(max-min)+1];

        for (int i = 0; i<arr.length; i++){
            countArr[arr[i]-min]++;
        }

        int j = 0;
        for (int i = min; i<= max; i++){
            while(countArr[i-min] > 0){
                arr[j++] = i;
                countArr[i-min]--;
            }
        }
    }
}
