package com.dsa;

import java.sql.SQLOutput;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {4725, 4724, 1330, 8792, 1594, 5729 };
        System.out.println(Arrays.toString(arr));
        radixSort(arr,10,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void radixSort(int[] arr,int radix,int width){
        for (int i = 0; i < width; i++){
            radixSingleSort(arr,radix,i);
        }
    }
    public static void radixSingleSort(int[] arr,int radix,int position){
        int[] countArr = new int[radix];

        for (int i = 0; i<arr.length;i++){
            countArr[getPosition(arr[i],position)]++;
        }


        for (int i=1; i< radix;i++){
            countArr[i] += countArr[i-1];
        }

        int[] temp = new int[arr.length];
        for (int i = arr.length-1; i>=0;i--){
            temp[--countArr[getPosition(arr[i],position)]] = arr[i];
        }
        System.arraycopy(temp,0,arr,0,temp.length);
    }
    public static int getPosition(int value,int position){
        return value/(int) Math.pow(10,position) % 10;
    }

}
