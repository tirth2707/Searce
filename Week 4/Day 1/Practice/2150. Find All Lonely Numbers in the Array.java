
//https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/

class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        ArrayList<Integer> values = new ArrayList<>();
        
        int z=1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    z=2;
                }
            }
            if(z==2)
            {
                set2.add(nums[i]);
                z=1;
            }
            else if(!set2.contains(nums[i]))
            {
                System.out.println("Added in"+nums[i]);
                System.out.println("Index"+i);
                set.add(nums[i]);
                
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!set2.contains(nums[i]))
            {
                int temp1=nums[i]+1;
                int temp2=nums[i]-1;

                if(!set.contains(temp1) && !set.contains(temp2) && !set2.contains(temp1) && !set2.contains(temp2))
                {
                    values.add(nums[i]);
                }
            
            }
            
            
            
        }
        
        return values;
        

    }
}