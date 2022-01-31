//https://leetcode.com/contest/weekly-contest-277/problems/rearrange-array-elements-by-sign/


class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
        int n=nums.length/2;
            
        int a[]=new int[n];
        int b[]=new int[n];
        int i=0,j=0;
        
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]<0)
            {
                b[j]=nums[k];
                j++;
            }
            else
            {
                a[i]=nums[k];
                i++;
            }
        }
        
        i=0;
        j=0;
        int temp=1;
        for(int k=0;k<nums.length;k++)
        {
            if(temp==1)
            {
                nums[k]=a[i];
                i++;
                temp=0;
            }
            else
            {
                nums[k]=b[j];
                j++;
                temp=1;
            }
            
            
        }
        
        return nums;
        
        
        
    }
}