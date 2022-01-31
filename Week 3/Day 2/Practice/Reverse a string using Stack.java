
// https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1#

class Solution {
    
    public String reverse(String S){
        
        
        char reversed;
       
       String newString = "";
       Stack<Character> stack = new Stack<Character>();
       char ch[] =  S.toCharArray();
       for(int i=0; i<S.length(); i++){
           stack.push(ch[i]);
       }
       
        for(int i=0; i<S.length(); i++){
           reversed = stack.pop();
           newString = newString + reversed;
       }
       
       return newString;
    }

}