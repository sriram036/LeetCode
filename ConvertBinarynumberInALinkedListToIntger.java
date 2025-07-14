public class ConvertBinarynumberInALinkedListToIntger {
    public static void main(String[] args){
        ListNode list= new ListNode();
        list.addLast(1);
        list.addLast(0);
        list.addLast(1);
        list.display();
        System.out.println(getDecimalValue(list.head));
    }
    public static int getDecimalValue(ListNode head) {
        ListNode temp = reverseList(head);
        int res = 0;
        int counter = 0;
        while(temp != null){
            if(temp.val==1){
                res += Math.pow(2, counter);
            }
            counter += 1;
            temp = temp.next;
        }
        return res;
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next;
        while(pres != null){
            next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
        return prev;
    }
}
