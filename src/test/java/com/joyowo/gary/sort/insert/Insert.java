package com.joyowo.gary.sort.insert;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Insert {

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i;
            while (j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }

}
