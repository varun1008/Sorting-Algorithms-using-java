package com.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {200,132,54,114,154,65,4,9,-111};

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("********************************");
        int unsortedArrIndex = arr.length-1;
        int temp;
        while(unsortedArrIndex !=0) {
            for (int i = 0; i < unsortedArrIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            unsortedArrIndex--;
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
