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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null) return new int[] {-1 , -1};

        ListNode temp = head.next;

        int minDist = Integer.MAX_VALUE;
        int maxDist = 0;

        int f_index = -1;
        int l_index = -1;
        int idx = 1;
        int prevVal = head.val;

        while(temp.next!=null) {
            idx++;
            int currVal = temp.val;
            int nextVal = temp.next.val;

            if((currVal > prevVal && currVal > nextVal) || (currVal < prevVal && currVal < nextVal)) {
                if(f_index == -1) {
                    f_index = idx;
                }
                else if(l_index == -1) {
                    minDist = (idx-f_index);
                    l_index = idx;
                }
                else {
                    minDist = Math.min(minDist , idx-l_index);
                    l_index = idx;
                }
            }

            temp = temp.next;
            prevVal = currVal;
        }

        if(f_index == -1 || l_index == -1) return new int[]{-1,-1};

        return new int[]{minDist , l_index-f_index};

    }
}