
// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/






/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        
       List<Integer> values = new ArrayList<>();
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            values.add(temp.val);
            temp=temp.next;
        }
        int j=0;
        int max=0;
        int size=values.size() - 1;
        while(j<size)
        {
            max=Math.max(max,values.get(j) + values.get(size));
            j++;
            size--;
            
        }
        return max;
        
            
    }
}