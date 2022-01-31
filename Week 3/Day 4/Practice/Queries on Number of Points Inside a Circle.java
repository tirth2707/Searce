
//https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int ans[]=new int[queries.length];
        for(int j=0;j<queries.length;j++)
        {
            int x1=queries[j][0];
            int y1=queries[j][1];
            int r=queries[j][2];
            int count=0;
            
            for(int i=0;i<points.length;i++)
            {
                int tempx1=points[i][0];
                int tempy1=points[i][1];
                
                double finalx=Math.abs(tempx1-x1);
                double finaly=Math.abs(tempy1-y1);
                double ans1=Math.sqrt(finaly*finaly + finalx*finalx);
                if(ans1<=r)
                {
                    
                        count++;
                   
                }
                
                
                
                
            }
            ans[j]=count;
        }
        return ans;
    }
}