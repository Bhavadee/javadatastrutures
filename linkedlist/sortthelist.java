class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode ans = new ListNode();
        ListNode ptr = ans;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ans.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                ans.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            ans = ans.next;
        }
        while(list1 != null){
            ans.next = new ListNode(list1.val);
            list1 = list1.next;
            ans = ans.next;
        }
        while(list2 != null){
            ans.next = new ListNode(list2.val);
            list2 = list2.next;
            ans = ans.next;
        }
        return ptr.next;
    }
}
