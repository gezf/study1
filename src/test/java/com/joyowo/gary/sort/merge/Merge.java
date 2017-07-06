package com.joyowo.gary.sort.merge;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Merge {

    public static void sort(int[] arr,int low,int high){
        if(low<high){
            int middle = (low+high)/2;
            sort(arr,low,middle);
            sort(arr,middle+1,high);
            merge(arr,low,high,middle);
        }
    }

    private static void merge(int[] arr,int low,int high,int middle){
        int[] temp = new int[arr.length];
        int i = low;
        int j = middle+1;
        int index = low;
        while (i<=middle && j<=high){
            if(arr[i]<arr[j])
                temp[index++]=arr[i++];
            else
                temp[index++]=arr[j++];
        }
        while (i<=middle)
            temp[index++]=arr[i++];
        while (j<=high)
            temp[index++]=arr[j++];
        while (low<=high){
            arr[low]=temp[low++];
        }
    }
}
