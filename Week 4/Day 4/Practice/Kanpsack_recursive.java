public class Kanpsack_recursive {

    static int knapsack(int wt[],int val[],int w,int n)
    {
        
        if(n==0 || w==0)
        {
            return 0;
        }

        if(wt[n-1]>w)
        {
            return knapsack(wt, val, w, n-1);
        }
        else
        {
            return Math.max(val[n-1]+knapsack(wt, val, w-wt[n-1], n-1),knapsack(wt,val,w,n-1));
        }



    }

    public static void main(String args[])
    {

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        System.out.println(knapsack(wt,val,W,n));
    }
    
}
