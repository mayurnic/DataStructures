package ProblemSolving;

import java.util.Arrays;

public class ReverseAString {

    public static void main(String args[])
    {
        reverse("helloi tanuja".toCharArray());

    }

    public static void reverse(char[] s)
    {
        for(int i=0; i<s.length/2;i++)
        {
            char temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
