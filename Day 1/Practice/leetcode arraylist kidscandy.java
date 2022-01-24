import java.util.List;
import java.io.*;
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int total=0;
        List<Boolean> output = new ArrayList<>(); 
        for(int i=0;i<candies.length;i++)
        {
            total=Math.max(total,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=total)
            {
                output.add(true);
            }
            else
            {
                output.add(false);
            }
        }
        
        return output;
        
    }
}