package com.dsa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {200, 132, 54, 114, 154, 65, 4, 9, -111};
        System.out.println(Arrays.toString(arr));
        System.out.println("********** Sorted array *********");
        quickSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr,int start,int end){
        if (end-start<2){
            return;
        }
        int partition = partition(arr,start,end);
        quickSort(arr,start,partition);
        quickSort(arr,partition+1,end);
    }

    public static int partition(int[] arr,int start,int end){
        int i = start;
        int j = end;
        int pivot = arr[i];
        while (i<j){
            while (i<j && arr[--j]>=pivot);
            if (i<j){
                arr[i] = arr[j];
            }
            while (i<j && arr[++i]<=pivot);
            if (i<j){
                arr[j] = arr[i];
            }
        }
        arr[i] = pivot;
        return i;
    }

}
