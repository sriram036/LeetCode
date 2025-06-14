public class PalindromeLinkedList{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        // list.addLast(2);
        // // list.addLast(3);
        // list.addLast(2);
        // list.addLast(1);
        System.out.println(isPalindrome(list.head));
    }
    // Approach - 1
    public static boolean isPalindrome(ListNode head) {
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
            last.next = prev;
        }
        newEnd.next = null;
        ListNode first = head;
        ListNode second = findMiddle(head);
        mid = second;
        while(second != null){
            if(first != mid && first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
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
    // Approach - 2
    // public static boolean isPalindrome(ListNode head) {
    //     String str = "";
    //     ListNode node = head;
    //     while(node != null){
    //         str += node.val;
    //         node = node.next;
    //     }
    //     StringBuilder reverseStr = new StringBuilder(str);
    //     String reStr = reverseStr.reverse().toString();
    //     if(str.equals(reStr)){
    //         return true;
    //     } 
    //     return false;
    // }
}