public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args){
        ListNode headA = new ListNode();
        ListNode headB = new ListNode();
        headA.addLast(4);
        headA.addLast(1);
        headA.addLast(8);
        headA.addLast(4);
        headA.addLast(5);
        headB.addLast(5);
        headB.addLast(6);
        headB.addLast(1);
        ListNode tempA = headA.head;
        for(int i = 0; i < 2; i++){
            tempA = tempA.next;
        }
        ListNode tempB = headB.head;
        for(int i = 0; i < 2; i++){
            tempB = tempB.next;
        }
        tempB.next = tempA;
        // System.out.println(tempA.val + " " + tempB.next.val);
        System.out.println(getIntersectionNode(headA.head, headB.head).val);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int aLength = 1;
        int bLength = 1;
        while (tempA.next != null) {
            aLength++;
            tempA = tempA.next;
        }
        while(tempB.next != null){
            bLength++;
            tempB = tempB.next;
        }
        if(tempA != tempB){
            return null;
        }
        // System.out.println(aLength + " " + bLength);
        if(aLength > bLength){
            while(aLength--!=bLength){
                headA = headA.next;
            }
        }
        else{
            while (bLength--!=aLength) {
                headB = headB.next;
            }
        }
        // System.out.println(headA.val + " " + headB.val);
        while (headA != null && headB != null && headA != headB) {
            // System.out.println(headA.val + " " + headB.val);
            if(headA != null){
                headA = headA.next;
            }
            if(headB != null){
                headB = headB.next;
            }
        }
        return headA;
    }
}
