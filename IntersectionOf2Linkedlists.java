// day 85

import java.util.*;
public class IntersectionOf2Linkedlists {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // int j=0;
        // for(int i=0;i<headA.size;i++,j++)
        // {
        //     if(headA.get(i)==headB.get(j))
        //         return headA.get(i);
        // }
        // return null;
        ListNode i = headA, j = headB; // the pointers of both the list nodes
        while (i != j) {
            if(i==null)
                i=headB;
            else
                i=i.next;
            
            if(j==null)
                j=headA;
            else
                j=j.next;
        
        }
        return i;
       
    }
}