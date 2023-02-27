package com.dsa;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {200, 132, 54, 114, 154, 65, 4, 9, -111};
        System.out.println(Arrays.toString(arr));
        System.out.println("********** Sorted array *********");
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int start,int end){
        if (end-start<2){
            return;
        }
        int mid = (start+end)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start, int mid, int end){
        if (arr[mid-1] <= arr[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end-start];
        while (i<mid && j<end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        //copy remaining elements in left array
        System.arraycopy(arr,i,arr,start+tempIndex,mid-i);
        //copy temp to arr
        System.arraycopy(temp,0,arr,start,tempIndex);


    }
}
