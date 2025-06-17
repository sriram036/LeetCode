public class RotateList{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();

        ListNode rotatedList = rotateRight(list.head, 2);
        rotatedList.head = rotatedList;
        rotatedList.display();
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode node = head;
        int len = 1;
        while(node.next != null){
            node = node.next;
            len += 1;
        }
        node.next = head;
        ListNode temp = head;
        int rotate = k%len;
        for(int i = 0; i < len-rotate-1; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}