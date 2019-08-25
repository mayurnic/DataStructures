package ProblemSolving;

import java.util.Arrays;

public class FirstAndSecondHighestNumberInList {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 5, 6, 8, 9, 0, 11, -1};
        int max1=a[0],max2=a[1];

        if(a[0]>a[1])
        {
            max1=a[0];
            max2=a[1];
        }
        else
        {
            max1=a[1];
            max2=a[0];
        }

        for(int i=2; i<a.length; i++)
        {
          if(a[i]<max2)
          {continue;}
          else
          {
              if(a[i]>max1)
              {
                  max2=max1;
                  max1=a[i];

              }
          }
        }
        System.out.println(max1);
    }
}
