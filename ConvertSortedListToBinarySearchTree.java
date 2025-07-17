public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(-10);
        list.addLast(-3);
        list.addLast(0);
        list.addLast(5);
        list.addLast(9);
        list.display();
        TreeNode tree = sortedListToBST(list.head);
        tree.root = tree;
        tree.display();
    }
    public static TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        if(prev != null){
            prev.next = null;
            root.left = sortedListToBST(head);
        }
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
