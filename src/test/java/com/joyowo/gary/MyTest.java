package com.joyowo.gary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jishu0425 on 2017/4/24.
 */


@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {

    private int[] arr = {6,1,4,3,7,8,6,7,0,2,9};

    private void print(int[] arr){
        System.out.print("[ ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(",");
        }
        System.out.println("]");
    }

    @Test
    public void test1(){
        print(arr);
        insertSort(arr);
        print(arr);
    }

    @Test
    public void test2(){
        print(arr);
        shell(arr);
        print(arr);
    }

    @Test
    public void test3(){
        print(arr);
        querySort(arr,0,arr.length-1);
        print(arr);
    }

    @Test
    public void test4(){}

    private void querySort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int middle = getMiddle(arr,low,high);
        querySort(arr,low,middle-1);
        querySort(arr,middle+1,high);
    }

    private int getMiddle(int[] arr,int low,int high){
        int middle = arr[low];
        while (low<high){
            while (low<high && middle<=arr[high])
                high--;
            arr[low] = arr[high];
            while (low<high && middle>=arr[low])
                low++;
            arr[high] = arr[low];
        }
        arr[low] = middle;
        return low;
    }

    private void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    private void shell(int[] arr){
        for(int shell=arr.length/2;shell>0;shell--){
            for(int i=shell;i<arr.length;i+=shell){
                int temp = arr[i];
                int j = i-shell;
                while (j>=0 && arr[j]>temp){
                    arr[j+shell] = arr[j];
                    j-=shell;
                }
                arr[j+shell] = temp;
            }
        }
    }
}
