package sort;

import javax.swing.*;

public class quicksort {

    public static void quicksort(int[] arr, int low, int high) {
        int i;//low 找的是比基准大的数
        int j; //high 找的是比基准小的数
        int temp;
        int t;//辅助记录
        if (low > high) {
            return;
        }
        temp = arr[low];//设置标志,默认数组第一位置的数字为基准
        i = low;//排序左指针
        j = high;//排序右指针
        while (i < j) {//开始比较左右指针位置
            while (temp <= arr[j] && i < j) {//从右往左开始寻找比标志大的数
                j--;
            }
            while (temp >= arr[i] && i < j) {//从左往右找比标志小的数
                i++;
            }
            if (i < j) {//这时已经找到了，则进行交换位置
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        System.out.print("arr[low]="+arr[low]+" ");
        System.out.print("i="+low+" ");
        System.out.print("arr[i]="+arr[i]+" ");
        System.out.print("temp="+temp+" ");

        arr[low] = arr[j];
        arr[j] = temp;
        System.out.println("j="+high+" ");

        //用i，j皆可
        quicksort(arr, low, j - 1);//
        quicksort(arr, j + 1, high);

    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 3, 7, 1, 5, 6, 2 };
        quicksort(arr, 0, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
