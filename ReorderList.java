public class ReorderList{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.display();
        reorderList(list.head);
        list.display();
    }
    public static void reorderList(ListNode head) {
        reverseList(head);
    }
    public static void reverseList(ListNode head){
        int len = findLength(head);
        ListNode mid = findMiddle(head);
        ListNode pres = head;
        ListNode prev = null;
        while(pres != mid){
            prev = pres;
            pres = pres.next;
        }
        ListNode last = prev;
        ListNode newEnd = pres;
        ListNode nex = null;
        while(pres != null){
            nex = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nex;
        }
        if(last != null){
            if(len%2==0){
                last.next = null;
            }
            else{
                last.next.next = null;
            }
        }
        newEnd.next = null;
        
        ListNode start = head;
        ListNode secondmid = prev;
        ListNode temp = null;
        while(start != null && secondmid != null){
            temp = start.next;
            start.next = secondmid;
            start = temp;
            temp = secondmid.next;
            secondmid.next = start;
            secondmid = temp;
        }
    }
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static int findLength(ListNode head){
        int count = 0;
        ListNode node = head;
        while(node != null){
            node = node.next;
            count++;
        }
        return count;
    }
}