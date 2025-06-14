public class ReverseLinkedListTwo{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.display();
        reverseBetween(list.head, 2, 5);
        list.display();
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode nex = null;
        for(int i = 0; i <left-1; i++){
            prev = pres;
            pres=pres.next;
        }
        ListNode last = prev;
        ListNode newEnd = pres;
        for(int i = left; i <= right; i++){
            nex = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nex;
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = pres;
        return head;
    }
}