public class ReverseNodesInKGroup {
    public static void main(String[] args){
        ListNode list = new ListNode();
        for (int i = 1; i <= 5; i++) {
            list.addLast(i);
        }
        list.display();
        list.head = reverseKGroup(list.head, 2);
        list.display();
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        int length = findLength(head);
        return reverseKnodes(null, head, 0, k, length);
    }
    public static ListNode reverseKnodes(ListNode last,ListNode newEnd, int index, int k, int totalLength){
        if(newEnd == null || index+k > totalLength){
            return newEnd;
        }
        ListNode prev = null;
        ListNode pres = null;
        ListNode next = null;
        if(index+k <= totalLength){
            prev = last;
            pres = newEnd;
            next = null;
            for(int i = 0; i < k; i++){
                next = pres.next;
                pres.next = prev;
                prev = pres;
                pres = next;
            }
            newEnd.next = reverseKnodes(null, pres, index+k, k, totalLength);
        }
        return prev;
    }
    public static int findLength(ListNode head){
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        if(fast == null){
            return count*2;
        }
        else{
            return (count*2)+1;
        }
    }
}
