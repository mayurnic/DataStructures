package ProblemSolving;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CommonElementWithIndexIn2Array {

    public static void main(String args[])
    {
        int a[]={0,6,1,2,3,4,5};
        int b[]={1,2,3,4,5,6,0};
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        Map<Integer,Integer> hm1=new HashMap<Integer,Integer>();
        int i=0,j=0;

        for(int temp:a)
        {
            hm.put(temp,i++);
        }


        for(int temp:b)
        {
            hm1.put(temp,j++);
        }

        if(i>j)
        {
            Iterator<Integer> ite=hm1.keySet().iterator();
            while(ite.hasNext())
            {
                Integer temp=ite.next();
                if(hm.containsKey(temp))
                {
                    System.out.println("Value:"+temp+" "+hm1.get(temp)+" "+hm.get(temp));
                }
            }
        }
        else {
            Iterator<Integer> ite = hm.keySet().iterator();
            while (ite.hasNext()) {
                Integer temp = ite.next();
                if (hm1.containsKey(temp)) {
                    System.out.println("Value:" + temp + " " + hm1.get(temp) + " " + hm.get(temp));
                }
            }
        }




    }

}
