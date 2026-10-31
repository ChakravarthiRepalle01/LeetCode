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
    public ListNode swapPairs(ListNode head) {

        ListNode temp = head;

        ArrayList<ListNode> list = new ArrayList<>();

        while(temp!=null) {
            list.add(temp);
            ListNode k = temp.next;
            temp.next = null;
            temp = k;
        }

        int i = 0 ;
        int j = 1 ;
        int n = list.size();

        while(j < n) {
            temp = list.get(i);
            list.set(i , list.get(j));
            list.set(j , temp);

            i += 2;
            j += 2;
        }

        ListNode dummyHead = new ListNode(0);
        temp = dummyHead;

        for(i = 0 ; i<n ; i++) {
            temp.next = list.get(i);
            temp = temp.next;
        }

        return dummyHead.next;
    }
}