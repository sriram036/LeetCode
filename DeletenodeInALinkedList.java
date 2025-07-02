public class DeletenodeInALinkedList {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(4);
        list.addLast(5);
        list.addLast(1);
        list.addLast(9);
        list.display();
        deleteNode(list.head.next);
        list.display();
    }
    public static void deleteNode(ListNode node) {
        ListNode temp = node;
        ListNode prev = null;
        while(temp.next != null){
            temp.val = temp.next.val;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
}
