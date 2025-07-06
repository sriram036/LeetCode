public class PlusOneLinkedList {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(9);
        list.addLast(9);
        list.display();
        list.head = plusOne(list.head);
        list.display();
    }
    public static ListNode plusOne(ListNode head) {
        ListNode temp = head;
        if(plusOneRecursion(temp)==1){
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }
    public static int plusOneRecursion(ListNode node){
        // System.out.println(node.val);
        if(node.next == null){
            if(node.val==9){
                node.val = 0;
                return 1;
            }
            else{
                node.val = node.val+1;
                return 0;
            }
        }
        int temp = plusOneRecursion(node.next);
        if(node.val + temp > 9){
            node.val = 0;
            return 1;
        }
        else{
            node.val += temp;
            return 0;
        }
        // plusOneRecursion(node.next);
    }
}
