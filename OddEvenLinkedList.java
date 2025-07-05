public class OddEvenLinkedList {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(2);
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(6);
        list.addLast(4);
        list.addLast(7);
        list.display();
        list.head = oddEvenList(list.head);
        list.display();
    }
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode even = new ListNode();
        ListNode oddFirst = odd;
        ListNode evenFirst = even;
        ListNode temp = head;
        while(temp != null){
            odd.next = temp;
            temp = temp.next;
            even.next = temp;
            if(temp != null){
                temp = temp.next;
            }
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenFirst.next;
        if(even != null){
            even.next = null;
        }
        return oddFirst.next;
    }
}
