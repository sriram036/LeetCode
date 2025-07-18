public class MergeKSortedLists {
    public static void main(String[] args){
        ListNode listOne = new ListNode();
        ListNode listTwo = new ListNode();
        ListNode listThree = new ListNode();

        listOne.addLast(1);
        listOne.addLast(4);
        listOne.addLast(5);

        listTwo.addLast(1);
        listTwo.addLast(3);
        listTwo.addLast(4);

        listThree.addLast(2);
        listThree.addLast(6);

        ListNode[] lists = {listOne, listTwo, listThree};
        ListNode res = new ListNode();
        res.head = mergeKLists(lists);
        res.display();
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        ListNode left = lists[0].head;
        ListNode right = lists[1].head;
        ListNode res = mergeTwoNode(left, right);
        res.head = res;
        for(int i = 2; i < lists.length; i++){
            res.head = mergeTwoNode(res.head, lists[i].head);
        }
        return res.head;
    }
    public static ListNode mergeTwoNode(ListNode left, ListNode right){
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
            }
            else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return res.next;
    }
}
