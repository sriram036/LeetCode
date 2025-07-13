public class DesignLinkedList {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(1, 0);
        ListNode temp = list.head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println(list.get(0));
    }

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(){
            this.val = -1;
        }
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    static class MyLinkedList {
        ListNode head;
        int size;
        public MyLinkedList() {
            head = new ListNode();
        }
        
        public int get(int index) {
            ListNode temp = head;
            for(int i = 0; i < index; i++){
                if(temp==null){
                    break;
                }
                temp = temp.next;
            }
            if(temp == null){
                return -1;
            }
            return temp.val;
        }
        
        public void addAtHead(int val) {
            ListNode newHead = new ListNode(val);
            if(head.val == -1){
                head = newHead;
                return;
            }
            newHead.next = head;
            head = newHead;
            size += 1;
        }
        
        public void addAtTail(int val) {
            ListNode last = new ListNode(val);
            if(head.val == -1){
                head = last;
                return;
            }
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = last;
            size += 1;
        }
        
        public void addAtIndex(int index, int val) {
            ListNode newnode = new ListNode(val);
            if(index <= 0){
                addAtHead(val);
                return;
            }
            if(index > size+1){
                return;
            }
            if(index == 0){
                addAtHead(val);
                return;
            }
            ListNode temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            if(temp != null){
                ListNode nex = temp.next;
                temp.next = newnode;
                newnode.next = nex;
            }
            size += 1;
        }
        
        public void deleteAtIndex(int index) {
            ListNode temp = head;
            if(index == 0){
                head = head.next;
                return;
            }
            for(int i = 0; i < index-1; i++){
                if(temp != null){
                    temp = temp.next;
                }
            }
            if(temp != null){
                if(temp.next != null){
                    temp.next = temp.next.next;
                    size -= 1;
                }
            }
        }
    }
}
