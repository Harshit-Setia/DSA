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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        int n=lists.length;

        while(true){
            int min=Integer.MAX_VALUE;
            int minIdx=-1;
            for(int i=0;i<n;i++){
                if(lists[i]!=null&&min>lists[i].val){
                    min=lists[i].val;
                    minIdx=i;
                }
            }
            if(minIdx==-1)break;

            temp.next=lists[minIdx];
            temp=temp.next;
            lists[minIdx]=lists[minIdx].next;
        }

        return dummy.next;
    }
}
