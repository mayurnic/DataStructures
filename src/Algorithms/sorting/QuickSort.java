package Algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

    public static  void main(String args[])
    {
        int a[]={1,0,5,4,2,8,9,7};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static int getPartitionIndex(int[]a, int start, int end)
    {
        //Select Pivot Element in Array
        int pivot=a[end];
        int partitionIndex=start;
        for(int i=start;i<end; i++)
        {
            if(a[i]<=pivot)
            {
            swap(a,partitionIndex,i);
            partitionIndex++;
            }
        }
        swap(a,partitionIndex,end);

        return partitionIndex;

    }

    public static void swap(int [] a, int index1, int index2)
    {
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
    public static void quickSort(int[] a, int start,int end)
    {
        if(start<end) {
        int partitionIndex=getPartitionIndex(a,start,end);

           quickSort(a, start, partitionIndex - 1);
           quickSort(a, partitionIndex + 1, end);
       }


    }
}
