
// https://leetcode.com/problems/two-sum/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            
            int temp2=target-temp;
            
            for(int j=i+1;j<nums.length;j++)
            {
                if(temp2==nums[j])
                {
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
        
        
    }
}