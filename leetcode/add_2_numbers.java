2->4->3 + 5->6->4 = 7->0->8

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int s = 0, carry = 0, a=0, b=0, data=0;
        ListNode head = null;
        ListNode prev = head;
        
        while(true)
        {
            if(temp1 == null && temp2 == null && carry==0)
            {
                break;
            }
            if(temp2 == null)
            {
                temp2 = new ListNode(0);
                temp2.next = null;
            }
            if(temp1 == null)
            {
                temp1 = new ListNode(0);
                temp1.next = null;
            }
            a = temp1.val;
            b = temp2.val;
            s = a + b + carry;
            carry = s/10;
            data = s%10;
            if(head == null)
            {
                head = new ListNode(data);
                head.next = null;
                prev = head;
            }
            else
            {
                prev.next = new ListNode(data);
                prev.next.next = null;
                prev = prev.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
     return head;   
    }
}
