// https://leetcode.com/problems/longest-valid-parentheses/

class Solution {
    public int longestValidParentheses(String s) {
        
        int len=s.length();
        
        Stack<Integer> s1= new Stack<>();
        int result=0;
        // int temp=-1;
        s1.push(-1);
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='(')
            {
                s1.push(i);   
            }
            else
            {
                if(!s1.empty())
                {
                    s1.pop();
                }
                
                if(!s1.empty())
                {
                    result=Math.max(result,i-s1.peek());
                }
                else
                {
                    s1.push(i);
                }
            }
        }
        
        return result;
        
    }
}