/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) 
    {
        return partition(lists,0,lists.length-1);    
    }
    public ListNode partition(ListNode[] lists, int l, int r)
    {
        if(l == r)
        {
            return lists[l];
        }
        if(l<r)
        {
            int mid = (l+r)/2;
            ListNode l1 = partition(lists,l,mid);
            ListNode l2 = partition(lists,mid+1,r);
            return merge(l1,l2);
        }
        else
            return null;
    }
    public ListNode merge(ListNode l1, ListNode l2)
    {
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        if(l1.val < l2.val)
        {
            l1.next = merge(l1.next,l2);
            return l1;
        }
        else 
        {
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }
    
}
