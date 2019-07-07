package Algorithms.src.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[])
    {

        int []array={1,-2,0,5,10,0};

        int size=array.length;

        for(int i=0; i<size-1; i++)
        {
            for(int j=i; j<size-1; j++)
            {
                if(array[j]> array[j+1])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(3/2);
    }



}
