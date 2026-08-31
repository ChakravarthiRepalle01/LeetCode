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
        
        if(head == null || head.next == null) return new int[]{-1,-1};

        List<Integer> dist = new ArrayList<Integer>();

        ListNode temp = head.next;

        int prevVal = head.val;
        int totalDist = 1;
        while(temp.next!=null) {
            totalDist++;
            int nextVal = temp.next.val;
            int currVal = temp.val;

            if((currVal > nextVal && currVal > prevVal) || (currVal < nextVal && currVal < prevVal)) {
                dist.add(totalDist);
            }
            temp = temp.next;
            prevVal = currVal;
        }

        int ans[] = new int[2];
        int distSize = dist.size();

        if(distSize<2) return new int[]{-1,-1};

        ans[1] = dist.get(distSize-1) - dist.get(0);
        ans[0] = dist.get(1) - dist.get(0);

        for(int i = 1 ; i<distSize ; i++) {
            ans[0] = Math.min(ans[0] , dist.get(i) - dist.get(i-1));
        }

        return ans;
    }
}