public class MiddleOfTheLinkedList{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        // list.addLast(6);
        list.display();
        System.out.println(middleNode(list.head).val);
    }
    // Approach - 1
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null){
            return slow;
        }
        return slow.next;
    }
    // Approach - 2
    // public static ListNode middleNode(ListNode head) {
    //     int length = 0;
    //     ListNode temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         length++;
    //     }
    //     ListNode res = head;
    //     for(int i = 0; i < length/2; i++){
    //         res = res.next;
    //     }
    //     return res;
    // }
}