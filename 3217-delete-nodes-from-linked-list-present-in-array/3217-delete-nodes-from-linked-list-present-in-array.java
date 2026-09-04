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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0 ; i<n ; i++) set.add(nums[i]);

        ListNode dummyHead = new ListNode(0);
        ListNode dummyTemp = dummyHead;
        ListNode temp = head;

        while(temp!=null) {
            if(!set.contains(temp.val)) {
                dummyTemp.next = new ListNode(temp.val);
                dummyTemp = dummyTemp.next;
            }
            temp = temp.next;
        }

        return dummyHead.next;
    }
}