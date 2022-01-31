import java.io.*;
import java.util.*;

public class Problem1 {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int customerEntry[]=new int[n];      // Customer Enter time in Ramu Shop
        int customerCook[]=new int[n];    //  Time Required to Cook Pan For specific Customer
        for(int i=0;i<n;i++)
        {
            customerEntry[i]=sc.nextInt();      
            customerCook[i]=sc.nextInt();

        }

        int totalWaitTime = 0;
        int currentWaittime =0;  //this variable tells if customer comes at this time than how long will customer have to wait 
        int tempindex=Integer.MIN_VALUE;
        boolean temp[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            int nextwaitime=Integer.MAX_VALUE;
            int j=0;
            while(j<n && customerEntry[j]<=currentWaittime)     // customer Enter time is less than current wait time than enter in loop
            {
                if(temp[j]==false && nextwaitime>customerCook[j])  
                {
                    nextwaitime=customerCook[j];   // minimum cook time 
                    tempindex=j;
                }

                j++;

            }

            temp[tempindex]=true;   
            currentWaittime =currentWaittime+nextwaitime;
            totalWaitTime = totalWaitTime + currentWaittime-customerEntry[tempindex];
    


        }

        int ans=totalWaitTime/n; 

        System.out.println(ans);

    }

}
