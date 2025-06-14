public class SortList{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(4);
        list.addLast(2);
        list.addLast(1);
        list.addLast(3);
        list.display();
        ListNode sortedList = sortList(list.head);
        while(sortedList != null){
            System.out.print(sortedList.val + " ");
            sortedList = sortedList.next;
        }
        System.out.println();
    }
    public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
    public static ListNode merge(ListNode left, ListNode right){
        ListNode newHead = new ListNode();
        ListNode nextNode = newHead;
        while(left != null && right != null){
            if(left.val < right.val){
                nextNode.next = left;
                left = left.next;
                nextNode = nextNode.next;
            }
            else{
                nextNode.next = right;
                right = right.next;
                nextNode = nextNode.next;
            }
        }
        nextNode.next = (left != null) ? left : right;
        return newHead.next;
    }
    public static ListNode findMid(ListNode head){
        ListNode prev = null;
        while(head != null && head.next != null){
            prev = (prev==null)?head : prev.next;
            head = head.next.next;
        }
        ListNode mid = prev.next;
        prev.next = null;
        return mid;
    }
}