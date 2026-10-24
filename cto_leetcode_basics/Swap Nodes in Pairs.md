// https://leetcode.com/problems/swap-nodes-in-pairs/description/
/* 
24. Swap Nodes in Pairs
Medium
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]
*/
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

// iterative approach
class Solution 
{
    public ListNode swapPairs(ListNode head) 
    {   
        if(head==null ) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode p,f,s;
        p = dummy;

        while(head!= null && head.next!= null)
        {
            f = head;
            s = head.next ;

            f.next = s.next;
            s.next = f;
            p.next = s;

            head = f.next ;
            p = f;

        }
    return dummy.next ;
    }
}


// recursive approach
class Solution
{
    public void swapfunc(ListNode prev, ListNode Head)
    {
        if( Head== null || Head.next==null) return;
        ListNode f =  Head;
        ListNode s = f.next;

        f.next = s.next;
        s.next = f;
        prev.next=s;

        swapfunc(f,f.next);


    }
    public ListNode swapPairs(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;

        swapfunc(p,head);
        return dummy.next;
    }
}
