package ProblemSolving;

public class FirstUniqueInString {
    static char charCount[]=new char[256];

    public static void main(String args[])
    {
        System.out.println(getUniqueCharInString("aaaadfsdfsd"));
    }

    public static char[] generateCharArray(String input)
    {
        char[] charArray=input.toCharArray();

        for(char temp:charArray)
        {
            charCount[temp]++;
        }
        return charArray;
    }
    public static  int getUniqueCharInString(String input)
    {
        char[] temp=generateCharArray(input);

        for(int i=0;i<temp.length; i++)
        {
            if(charCount[temp[i]]==1)
                return i;

        }
        return -1;

    }
}
