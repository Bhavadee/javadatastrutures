class Solution {
    public ListNode swapNodes(ListNode head, int k) {
         ListNode temp = head;
         ListNode a = head;
         ListNode b = head;
        int c = 0;
        while(temp != null){ 
            c++;
            if(c == k) 
            {
                a = temp;
            }
            temp = temp.next;
        }
        temp = head;
        for(int i=0;i<=c;i++){
            if(i == (c - k))
            { 
                b = temp;
                break;
            }
            temp = temp.next;
        }
        int t = a.val;
        a.val = b.val;
        b.val = t;
        return head;
    }
}