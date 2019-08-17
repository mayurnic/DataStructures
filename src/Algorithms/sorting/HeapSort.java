package Algorithms.sorting;

import java.util.Arrays;

public class HeapSort {

    public static void main(String args[]) {
        int a[] = {1, 5, 8, 0, -7, 12, 4};
        createMaxHeap(a);
        System.out.println(Arrays.toString(a));
        heapsort(a);
        System.out.println(Arrays.toString(a));


    }

public static void heapsort(int a[])
{
    int length=a.length-1;
    while(length>0)
    {
        swap(a, 0, length);
        System.out.println(Arrays.toString(a));
        createMaxHeap(a,length--);
        System.out.println(Arrays.toString(a));
    }
}

    public static void createMaxHeap(int[] a) {

        for(int i=1;i<a.length; i++)
        {
            swap(a,i);
        }
    }

    public static void createMaxHeap(int[] a,int length) {

        for(int i=1;i<length; i++)
        {
            swap(a,i);
        }
    }


   public static void swap(int[] a, int i)
   {
       int ancestorIndex;
       if(i%2==0)
           ancestorIndex=i/2-1;
       else
           ancestorIndex=i/2 ;

       if(a[ancestorIndex]<a[i])
       {
           int temp=a[ancestorIndex];
           a[ancestorIndex]=a[i];
           a[i]=temp;

           if(ancestorIndex>0)
           swap(a,ancestorIndex);
       }
   }

    public static void swap(int[] a, int i,int j)
    {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
    }

}