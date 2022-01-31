
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int ans=0;
        for(int i=0;i<sentences.length;i++)
        {
            String temp=sentences[i];
            char c[]=temp.toCharArray();
            int count=0;
            for(int j=0;j<c.length;j++)
            {
               System.out.println(c[j]);
                if(c[j]==' ')
                {
                    count++;
                }
            }
           System.out.println("count"+count);
            ans=Math.max(ans,count);
        }
        return ans+1;
        
    }
}