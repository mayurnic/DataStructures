package Algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String argsp[]) {
        int a[] = {5, 2, 1, 0, 9, -1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static int[] sort(int[] a) {
        int length = a.length;

        for (int i = 0; i < length-1; i++) {
            int minIndex=i;
            for(int j=i+1; j<length; j++)
            {
                if(a[minIndex]>a[j]) {
                    minIndex = j;
                    int temp=a[minIndex];
                    a[minIndex]=a[i];
                    a[i]=temp;
                }
                }


        }
return a;
    }

}
