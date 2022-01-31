
// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        
        int temp=nums[0];
        int temp1=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            temp=Math.max(temp+nums[i],nums[i]);
            temp1=Math.max(temp,temp1);
        }
        return temp1;
        
    }
}