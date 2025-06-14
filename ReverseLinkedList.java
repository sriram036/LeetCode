public class ReverseLinkedList{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
        ListNode reverse = reverseList(list.head);
        reverse.head = reverse;
        reverse.display();
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        ListNode nex = null;
        while(pres != null){
            nex = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nex;
        }
        return prev;
    }
}