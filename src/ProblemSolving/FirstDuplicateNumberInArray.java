package ProblemSolving;

public class FirstDuplicateNumberInArray {

    public static void main(String args[])
    {
        int a[]={1,2,3,4,4,0,0};
        System.out.println(findDuplicateNumber(a));
    }

    public static int findDuplicateNumber(int a[])
    {
        int count[]=new int[a.length];

        for(int i=0; i<a.length; i++)
        {
        if(count[a[i]]>=1)
            return a[i];
        else
            count[a[i]]++;
        }

        return -1;
    }
}
