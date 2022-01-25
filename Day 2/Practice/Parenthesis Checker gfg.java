
// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        int a=0; //()
        int b=0; //{
        int c=0; //[]
        
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='(')
            {
                a++;
            }
            if(x.charAt(i)==')')
            {
                a--;
            }
            if(x.charAt(i)=='{')
            {
                b++;
            }
            if(x.charAt(i)=='}')
            {
                b--;
            }
            if(x.charAt(i)=='[')
            {
                c++;
            }
            if(x.charAt(i)==']')
            {
                c--;
            }
            
        }
        if(a==0 && b==0 && c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
