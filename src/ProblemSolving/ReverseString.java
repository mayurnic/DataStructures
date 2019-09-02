package ProblemSolving;

import java.util.Arrays;

public class ReverseString {
    public static void main(String args[])
    {
        System.out.println(reverseWords("Mayur Indore Gupta"));
    }
    public static String reverseWords(String s) {

        char[] array=s.toCharArray();

        int wordLength=0;

        for(int i=0; i<array.length;i++)
        {

            if((array[i]==' '))
            {
                int startIndex=i-wordLength;
                int endIndex=i-1;
                for(int j=startIndex; j<endIndex; j++)
                {
                    char temp=array[j];
                    array[j]=array[endIndex];
                    array[endIndex]=temp;
                    endIndex--;
                }
                wordLength=0;

            }
            else if(i==array.length-1){
                int counter=0;
                for(int j=i-wordLength; j<array.length-counter; j++)
                {
                    char temp=array[j];
                    array[j]=array[array.length-1-counter];
                    array[array.length-1-counter]=temp;
                    counter++;
                }
        }

            else
            {
                wordLength++;
            }
        }
        return new String(array);
    }
}
