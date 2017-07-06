package com.joyowo.gary.sort.shell;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Shell {

    public static void sort(int[] arr){
        for(int shell=arr.length/2;shell>0;shell--){
            for(int i=2*shell-1;i<arr.length;i+=shell){
                int temp = arr[i];
                int j=i;
                while (j>=shell && temp<arr[j-shell]){
                    arr[j] = arr[j-shell];
                    j-=shell;
                }
                arr[j]=temp;
            }
        }
    }

}
