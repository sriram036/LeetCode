public class LinkedListCycleTwo{
    public static void main(String[] args){
        ListNode list = new ListNode();

        list.addLast(1);
        list.addLast(3);
        list.addLast(6);
        list.addLast(11);

        list.display();
        ListNode temp = list.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = list.head.next;
        ListNode res = detectCycle(list.head);
        if(res==null){
            System.out.println("no cycle");
        }
        else{
            ListNode indexNode = list.head;
            int index = 0;
            while(indexNode.val != res.val){
                indexNode = indexNode.next;
                index++;
            }
            System.out.println("tail connects to node index " + index);
        }
    }
    public static ListNode detectCycle(ListNode head) {
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                do{
                    slow = slow.next;
                    count++;
                }
                while(slow != fast);
                System.out.println(count);
                break;
            }
        }
        if(fast == null || slow == null || fast.next == null){
            return null;
        }
        ListNode temp = head;
        while(temp != slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
}