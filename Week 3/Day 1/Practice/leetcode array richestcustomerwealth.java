
// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max=0;
        int temp=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                max=max+accounts[i][j];
            }
            
            temp=Math.max(temp,max);
            max=0;
        }
        return temp;
        
        
    }
}