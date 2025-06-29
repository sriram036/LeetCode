public class InsertionSortList {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(4);
        list.addLast(2);
        list.addLast(1);
        list.addLast(3);
        list.display();

        list.head = insertionSortList(list.head);
        list.display();
    }
    public static ListNode insertionSortList(ListNode head) {
        ListNode newHead = new ListNode();
        ListNode curr = head;
        while(curr != null){
            ListNode prev = newHead;
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }
            ListNode next = curr.next;
            if(prev != null){
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = next;
        }
        return newHead.next;
    }
}
