package ProblemSolving;

import java.util.HashSet;

public class PairInArrayEqualToSum {

    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,5,6,8,9,0,11,-1};
        int sum=10;
        HashSet<Integer> hm=new HashSet<>();

        for(int temp: a)
        {
            if(hm.contains(sum-temp))
            {
                System.out.println(temp+" "+(sum-temp));
            }
            hm.add(temp);
        }

    }
}
