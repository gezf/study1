package com.joyowo.gary.sort.fast;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Fast {
    public static void sort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int middle = getMiddle(arr,low,high);
        quickSort(arr,low,middle-1);
        quickSort(arr,middle+1,high);
    }

    private static int getMiddle(int[] arr,int low,int high){
        int middle = arr[low];
        while (low<high){
            while (low<high && middle<=arr[high])
                high--;
            arr[low] = arr[high];
            while (low<high && middle>=arr[low])
                low++;
            arr[high] = arr[low];
        }
        arr[low]=middle;
        return low;
    }
}
