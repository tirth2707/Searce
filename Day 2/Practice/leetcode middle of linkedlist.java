


//https://leetcode.com/problems/middle-of-the-linked-list/



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
    public ListNode middleNode(ListNode head) {
        
        ListNode temp=head;
        ListNode first=head;
        ListNode second=head;
        int ans=0;
        while(second.next!=null)
        {
            ans++;
            first=first.next;
            second=second.next;
            if(second.next!=null)
            {
                 second=second.next;
            }
            
        }
//         if(ans%2==0)
//         {
//             first=first.next;
            
//         }
        return first;
    
    }
}