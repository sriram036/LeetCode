public class PartitionList {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(5);
        list.addLast(2);
        list.display();
        list.head = partition(list.head, 3);
        list.display();
    }
    public static ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        ListNode smaller = null;
        ListNode sOut = null;
        ListNode larger = null;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                ListNode t = new ListNode(temp.val);
                if(smaller == null){
                    smaller = t;
                    sOut = smaller;
                }
                smaller.next = t;
                smaller = smaller.next;
            }
            temp = temp.next;
        }
        ListNode tem = head;
        ListNode lOut = null;
        while(tem != null){
            if(tem.val >= x){
                ListNode t = new ListNode(tem.val);
                if(larger == null){
                    larger = t;
                    lOut = larger;
                }
                larger.next = t;
                larger = larger.next;
            }
            tem = tem.next;
        }
        if(smaller != null){
            smaller.next = lOut;
        }
        else{
            sOut = lOut;
        }
        ListNode t = sOut;
        while(t != null && t != t.next){
            t = t.next;
        }
        if(t != null){
            t.next = null;
        }
        return sOut;
    }
}
