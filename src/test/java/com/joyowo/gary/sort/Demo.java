package com.joyowo.gary.sort;

import com.joyowo.gary.sort.fast.Fast;
import com.joyowo.gary.sort.shell.Shell;
import com.joyowo.gary.sort.insert.Insert;
import com.joyowo.gary.sort.merge.Merge;
import org.junit.Test;

/**
 * Created by jishu0425 on 2017/5/3.
 */
public class Demo {

    private int[] arr = {3, 1, 5, 7, 8, 2, 4, 9, 6, 10, 8};

    @Test
    public void test1() {
        Insert.sort(arr);
        print();
    }

    @Test
    public void test2() {
        Shell.sort(arr);
        print();
    }

    @Test
    public void test3() {
        Fast.sort(arr);
        print();
    }

    @Test
    public void test4() {
        Merge.sort(arr, 0, arr.length - 1);
        print();
    }

    @Test
    public void test5() {
        for (int i = 1; i < arr.length; i++)
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        print();
    }


    private void print() {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

}
