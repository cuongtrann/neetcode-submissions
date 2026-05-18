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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // khoi tao node dau tien
        // Lưu ý, tạo một list đã có một node trước
        ListNode node = new ListNode(0);
        // Tạo một node dummy để lưu head rác, return về dummy.next
        ListNode dummy = node;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                // add cur 1 vao result
                node.next = list1;
                list1 = list1.next;
            } else{
                node.next = list2;
                // add cur 2 vao result
                list2 = list2.next;
            }
            node = node.next;
        }

        if(list1!=null){
            // them not vao
            node.next = list1;
        } else {
            node.next = list2;
        }

        return dummy.next;
    }
}