// https://leetcode.com/problems/integer-to-roman/

class Solution {
    public String intToRoman(int num) {
        String ans="";
        while(num>0)
        {
            if(num>=1000)
            {
                num=num-1000;
                ans=ans+"M";
            }
            else if(num>=900)
            {
                num=num-900;
                ans=ans+"CM";
            }
            else if(num>=500)
            {
                num=num-500;
                ans=ans+"D";
            }
             else if(num>=400)
            {
                num=num-400;
                ans=ans+"CD";
            }
            
            
            else if(num>=100)
            {
                num=num-100;
                ans=ans+"C";
            }
            else if(num>=90)
            {
                num=num-90;
                ans=ans+"XC";
            }
            else if(num>=50)
            {
                num=num-50;
                ans=ans+"L";
            }
            else if(num>=40)
            {
                num=num-40;
                ans=ans+"XL";
            }
            else  if(num>=10)
            {
                num=num-10;
                ans=ans+"X";
            }
            else  if(num>=9)
            {
                num=num-9;
                ans=ans+"IX";
            }
             else if(num>=5)
            {
                num=num-5;
                ans=ans+"V";
            }
            else  if(num>=4)
            {
                num=num-4;
                ans=ans+"IV";
            }
             else if(num>=1)
            {
                num=num-1;
                ans=ans+"I";
            }
            
        }
        return ans;
        
    }
}